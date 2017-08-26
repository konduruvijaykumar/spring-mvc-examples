/**
 * 
 */
package org.pjay.springmvc.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vijayk
 * 
 * http://www.baeldung.com/custom-error-page-spring-mvc
 * https://github.com/in28minutes/SpringMvcStepByStep/blob/master/Step34.md
 * http://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/controller-advice-exception-handling/
 *
 */
// This is the controller called, when exception is not handled in application. This is called via web.xml configuration 
@Controller
public class ErrorController {

	@RequestMapping("/error")
	public ModelAndView showErrorPage(HttpServletRequest request) {
		ModelAndView errorModel = new ModelAndView("error");
		String errorMsg = "";
		int httpErrorCode = getHttpErrorCode(request);
		switch(httpErrorCode) {
			case 400:
				errorMsg = "Http Error Code: 400. Bad Request";
				break;
			case 401:
				errorMsg = "Http Error Code: 401. Unauthorized";
				break;
			case 404:
				errorMsg = "Http Error Code: 404. Resource not found";
				break;
			case 500:
				errorMsg = "Http Error Code: 500. Internal Server Error";
				break;
		}
		errorModel.addObject("errorMessage", errorMsg);
		return errorModel;
	}

	private int getHttpErrorCode(HttpServletRequest request) {
		return (int)request.getAttribute("javax.servlet.error.status_code");
	}
	
}
