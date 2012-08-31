/**
 * 
 */
package fr.tduchateau.coordinator;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.tduchateau.entity.Person;

/**
 * Coordinator that manages the persons.
 * 
 * @author tduchateau
 */
@Service
public interface IPersonCoordinator {

	/**
	 * Returns all the persons from the fake DB.
	 * 
	 * @return List<Person> All persons.
	 */
	public List<Person> findAll();
}
