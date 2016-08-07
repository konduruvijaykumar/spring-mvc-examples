/**
 * 
 */
package org.pjaygroup.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Vijay Konduru
 *
 */
public class HelloAbstractController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("hello", "message", "Hi from HelloAbstractController... ");
	}
}
