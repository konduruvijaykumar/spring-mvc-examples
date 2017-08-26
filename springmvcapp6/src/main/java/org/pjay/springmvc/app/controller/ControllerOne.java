/**
 * 
 */
package org.pjay.springmvc.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vijayk
 *
 */
@Controller
public class ControllerOne {
	
	@RequestMapping(value="/throwerrorcontroller1")
	public String throwRuntimeException(HttpServletRequest request, ModelMap model) {
		throw new NullPointerException("Throwing NullPointerException for testing");
//		model.put("errorMessage", "There is no error");
//		return "error";
	}
	
	// This is to handle exception at individual controller level, if this is not present or any specific exception missing. Then controller advice will act on that if handled in that location
	@ExceptionHandler(value= {Exception.class})
	private ModelAndView handleException(HttpServletRequest req, Exception exception) {
		ModelAndView modelAndView = new ModelAndView("error");
		// Error code will be null, hence we will get exception creating message, hence take only exception message
		//String message = "Error Code: " + (int) req.getAttribute("javax.servlet.error.status_code") + "Error Message: " + exception.getMessage();
		String message = "Error Message: " + exception.getMessage();
		modelAndView.addObject("errorMessage", message);
		return modelAndView;
	}

}
