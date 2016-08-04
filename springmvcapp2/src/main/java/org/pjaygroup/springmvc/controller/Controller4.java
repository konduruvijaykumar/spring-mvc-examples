/**
 * 
 */
package org.pjaygroup.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vijay
 *
 */
@Controller
public class Controller4 {
	@RequestMapping(value="/control4", method=RequestMethod.GET)
	public ModelAndView control4(){
		ModelAndView modelAndView = new ModelAndView("admissionForm4");
		return modelAndView;
	}
	
	@RequestMapping(value="/control41", method=RequestMethod.POST)
	public ModelAndView control41(@RequestParam(value="studentName", defaultValue="ABCXYZ") String name, @RequestParam("studentCourse") String course){
		ModelAndView modelAndView = new ModelAndView("admissionSuccess4");
		modelAndView.addObject("message", "Details Submitted are:: Name: " + name + ", Course: " + course);
		return modelAndView;
	}
	
	@RequestMapping(value="/control42", method=RequestMethod.POST)
	public ModelAndView control42(@RequestParam() Map<String, String> studentMap){
		String name = studentMap.get("studentName");
		String course = studentMap.get("studentCourse");
		ModelAndView modelAndView = new ModelAndView("admissionSuccess4");
		modelAndView.addObject("message", "Details Submitted are:: Name: " + name + ", Course: " + course);
		return modelAndView;
	}
}
