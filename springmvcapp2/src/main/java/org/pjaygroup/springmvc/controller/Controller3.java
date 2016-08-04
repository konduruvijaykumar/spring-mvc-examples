/**
 * 
 */
package org.pjaygroup.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vijay
 *
 */
@Controller
public class Controller3 {
	@RequestMapping("/control3/{countryName}/{userName}")
	public ModelAndView control3(@PathVariable("userName") String name, @PathVariable("countryName") String country){
		ModelAndView modelAndView = new ModelAndView("control3");
		modelAndView.addObject("message", "Hello Ms/Mr. " + name + " You are from " + country);
		return modelAndView;
	}
	
	// nested exception is java.lang.IllegalStateException: Could not find @PathVariable [path Map] in @RequestMapping] with root cause
	// Fix - use mvc:annotation-driven in config xml. http://stackoverflow.com/questions/27970602/could-not-find-pathvariable-pathvars-in-requestmapping-spring-mvc
	// With above fix spring uses RequestMappingHandlerMapping register. Without above fix spring uses DefaultAnnotationHandlerMapping registerHandler
	@RequestMapping("/control31/{countryName}/{userName}")
	public ModelAndView control31(@PathVariable() Map<String, String> pathMap){
		String name = pathMap.get("userName");
		String country = pathMap.get("countryName");
		ModelAndView modelAndView = new ModelAndView("control3");
		modelAndView.addObject("message", "Hello Ms/Mr. " + name + " You are from " + country);
		return modelAndView;
	}
}
