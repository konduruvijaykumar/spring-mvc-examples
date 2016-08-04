/**
 * 
 */
package org.pjaygroup.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vijay
 *
 */
@Controller
public class Controller1 {
	@RequestMapping("/control1")
	public ModelAndView control1(){
		ModelAndView modelAndView = new ModelAndView("control1");
		modelAndView.addObject("message", "Dear user, welcome to the first Annotation based Spring MVC application");
		return modelAndView;
	}
	
	@RequestMapping("/control12")
	public ModelAndView control12(){
		ModelAndView modelAndView = new ModelAndView("control1");
		modelAndView.addObject("message", "Your are calling control12 method on Controller1");
		return modelAndView;
	}
}
