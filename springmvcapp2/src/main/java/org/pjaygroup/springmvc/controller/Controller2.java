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
@RequestMapping("/greet")
public class Controller2 {
	@RequestMapping("/control2")
	public ModelAndView control2(){
		ModelAndView modelAndView = new ModelAndView("control2");
		modelAndView.addObject("message", "Dear user, welcome to the first Annotation based Spring MVC application");
		return modelAndView;
	}
	
	@RequestMapping("/control21")
	public ModelAndView control21(){
		ModelAndView modelAndView = new ModelAndView("control2");
		modelAndView.addObject("message", "Your are calling control21 method on Controller2");
		return modelAndView;
	}
}
