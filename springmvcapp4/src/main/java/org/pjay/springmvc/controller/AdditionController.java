/**
 * 
 */
package org.pjay.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pjay.springmvc.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vijayk
 * 
 * https://stackoverflow.com/questions/20742749/requested-resource-is-not-available-in-spring-mvc
 * https://stackoverflow.com/questions/13959331/the-requested-resource-not-available-in-spring-mvc
 * 
 * 
 *
 */
@Controller
public class AdditionController {
	
	@Autowired
	AdditionService additionService;
	
	@RequestMapping(value="/add")
	private ModelAndView addParams(HttpServletRequest request, HttpServletResponse response) {
		int param1 = Integer.parseInt(request.getParameter("param1"));
		int param2 = Integer.parseInt(request.getParameter("param2"));
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("sum", additionService.addParams(param1, param2));
		return modelAndView;
	}
	
	@RequestMapping(value="/add1")
	private ModelAndView addParams1(@RequestParam("param1") int p1, @RequestParam("param2") int p2) {
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("sum", additionService.addParams(p1, p2));
		return modelAndView;
	}

}
