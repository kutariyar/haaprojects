/**
 *      Project:HAAProject_SpringMVC       
 *    File Name:MovieController.java	
 * Created Time:2013-4-28上午10:52:50
 */
package com.haaproject.spring.mvc.controller;


/**
 * @author Geln Yang
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/movie")
public class MovieController {
 
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("movie", name);
		return "movie";
 
	}
 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
 
		model.addAttribute("movie", "this is default movie");
		return "movie";
 
	}
 
}