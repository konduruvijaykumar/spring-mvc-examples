/**
 * 
 */
package org.pjaygroup.springmvc.controller;

import java.util.Map;

import org.pjaygroup.springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vijay
 *
 */
@Controller
public class Controller5 {
	
	@ModelAttribute
	public void doCommonStuff(Model model){
		model.addAttribute("headerMessage", "PJAY group of Engineering Colleges");
	}
	
	@RequestMapping(value="/control5", method=RequestMethod.GET)
	public ModelAndView control5(){
		ModelAndView modelAndView = new ModelAndView("admissionForm5");
		// You can avoid repeating this same line of code in all methods by moving to common location as shown above.
		// modelAndView.addObject("headerMessage", "PJAY group of Engineering Colleges");
		return modelAndView;
	}
	
	@RequestMapping(value="/control51", method=RequestMethod.POST)
	public ModelAndView control51(@RequestParam("studentName") String name, @RequestParam("studentCourse") String course){
		Student student = new Student();
		student.setStudentName(name);
		student.setStudentCourse(course);
		ModelAndView modelAndView = new ModelAndView("admissionSuccess5");
		// You can avoid repeating this same line of code in all methods by moving to common location as shown above.
		// modelAndView.addObject("headerMessage", "PJAY group of Engineering Colleges");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
	
	@RequestMapping(value="/control52", method=RequestMethod.POST)
	public ModelAndView control52(@RequestParam() Map<String, String> studentMap){
		String name = studentMap.get("studentName");
		String course = studentMap.get("studentCourse");
		Student student = new Student();
		student.setStudentName(name);
		student.setStudentCourse(course);
		ModelAndView modelAndView = new ModelAndView("admissionSuccess5");
		// You can avoid repeating this same line of code in all methods by moving to common location as shown above.
		// modelAndView.addObject("headerMessage", "PJAY group of Engineering Colleges");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
	
	@RequestMapping(value="/control53", method=RequestMethod.POST)
	public ModelAndView control53(@ModelAttribute("student") Student student){
		// The model object is automatically filled by spring and gives student object
		ModelAndView modelAndView = new ModelAndView("admissionSuccess5");
		modelAndView.addObject("headerMessage", "PJAY group of Engineering Colleges");
		// You can avoid the code below as ModelAttibute annotation is adding it to ModelAndView Object with name defined in it
		// modelAndView.addObject("student", student);
		return modelAndView;
	}
}
