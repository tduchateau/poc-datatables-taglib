package fr.tduchateau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the basic examples management.
 * 
 * @author tduchateau
 */
@Controller
@RequestMapping("/basic")
public class BasicController extends BaseController {
	
	@RequestMapping(value="/default", method = RequestMethod.GET)
	public String goDefault(ModelMap model) {
		return "basic.default";
	}
}