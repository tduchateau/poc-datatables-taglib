package fr.tduchateau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.tduchateau.coordinator.IPersonCoordinator;
import fr.tduchateau.entity.Person;

/**
 * Base controller which populates request attributes used in all examples.
 * 
 * @author tduchateau
 */
@Controller
public class BaseController {
 
	@Autowired
	private IPersonCoordinator personCoordinator;
	
	@ModelAttribute("persons")
	public List<Person> populateTable(){
		return personCoordinator.findAll();
	}
}