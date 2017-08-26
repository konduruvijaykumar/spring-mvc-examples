/**
 * 
 */
package org.pjay.springmvc.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vijayk
 *
 */
@Controller
public class ControllerTwo {
	
	// Here no individual controller level exception handling done. Hence controller advice will act on eception  
	@RequestMapping(value="/throwerrorcontroller2")
	public String throwRuntimeException(HttpServletRequest request, ModelMap model) {
		throw new RuntimeException("Throwing RuntimeException for testing");
//		model.put("errorMessage", "There is no error");
//		return "error";
	}

}
