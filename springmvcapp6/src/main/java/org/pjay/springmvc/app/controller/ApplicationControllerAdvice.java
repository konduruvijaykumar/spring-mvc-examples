/**
 * 
 */
package org.pjay.springmvc.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vijayk
 *
 */
// Controller advice is applied across all controllers, if no exception handler found at a specific contoller level
@ControllerAdvice
// Not working if below annotation @EnableWebMvc is not added, solved this by adding <mvc:annotation-driven/> tag in xml file or add @EnableWebMvc to webcongif(configuration class) class extending WebMvcConfigurerAdapter or its different variants
//@EnableWebMvc
public class ApplicationControllerAdvice {
	
	@ExceptionHandler(value= {Exception.class, RuntimeException.class})
	private ModelAndView handleException(HttpServletRequest req, Throwable exception) {
		ModelAndView modelAndView = new ModelAndView("error");
		// Error code will be null, hence we will get exception creating message, hence take only exception message
		//String message = "Error Code: " + (int) req.getAttribute("javax.servlet.error.status_code") + "Error Message: " + exception.getMessage();
		String message = "Error Message: " + exception.getMessage();
		modelAndView.addObject("errorMessage", message);
		return modelAndView;
	}

}
