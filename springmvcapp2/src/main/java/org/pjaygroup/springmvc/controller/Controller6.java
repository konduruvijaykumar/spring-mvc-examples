/**
 * 
 */
package org.pjaygroup.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.pjaygroup.springmvc.model.StudentInfo;
import org.pjaygroup.springmvc.propertyeditors.StudentNameEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vijay
 *
 */
@Controller
public class Controller6 {
	
	@InitBinder
	public void modifyBindingFields(WebDataBinder binder){
		// This is used to remove binding of fields which you feel that you don't want
		// binder.setDisallowedFields(new String[] {"studentDOB"});
		// binder.setDisallowedFields(new String[] {"studentMobile", "studentAddress.street", "studentSkills"});
		// The below code does not work, we have to give individual fields of class like "studentAddress.street" etc.
		// binder.setDisallowedFields(new String[] {"studentAddress"});
		binder.setDisallowedFields(new String[] {"studentMobile"});
		// Registering custom editors for fields
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat, false));
		// Write your own custom data editor to perform any specific requirement, which is not given by spring built in custom property editors
		// http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/beans/propertyeditors/package-summary.html
		binder.registerCustomEditor(String.class,"studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/control6", method=RequestMethod.GET)
	public ModelAndView control6(){
		ModelAndView modelAndView = new ModelAndView("admissionForm6");
		return modelAndView;
	}
	
	@RequestMapping(value="/control61", method=RequestMethod.POST)
	public ModelAndView control61(@ModelAttribute("studentInfo") StudentInfo studentInfo, BindingResult bindingResult){
		// The model object is automatically filled by spring and gives studentInfo object
		if(bindingResult.hasErrors()){
			ModelAndView modelAndView = new ModelAndView("admissionForm6");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("admissionSuccess6");
		return modelAndView;
	}
	
	// Use any Java Bean Validation api such as hibernate validation framework or apache bean validation framework which implement JSR-303/JSR-349
	@RequestMapping(value="/control62", method=RequestMethod.POST)
	public ModelAndView control62(@Valid @ModelAttribute("studentInfo") StudentInfo studentInfo, BindingResult bindingResult){
		// The model object is automatically filled by spring and gives studentInfo object
		if(bindingResult.hasErrors()){
			ModelAndView modelAndView = new ModelAndView("admissionForm6");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("admissionSuccess6");
		return modelAndView;
	}
}
