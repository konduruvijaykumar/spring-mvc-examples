/**
 * 
 */
package org.pjay.springmvc.app.controller;

import org.pjay.springmvc.global.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vijayk
 *
 */
@Controller
public class TestBeanController {
	
	@Autowired
	TestBean testbeaninstance;
	
	@RequestMapping(value="/testbean", method=RequestMethod.POST)
	public ModelAndView verifyTestBean(@RequestParam("message") String msg) {
		testbeaninstance.setMessage(msg);
		ModelAndView modelAndView = new ModelAndView("testbeanresult");
		modelAndView.addObject("testbean", testbeaninstance);
		return modelAndView;
	}
	
	@RequestMapping(value="/testbean1", method=RequestMethod.POST)
	public ModelAndView verifyTestBean1(@ModelAttribute("testBean") TestBean testBean) {
		ModelAndView modelAndView = new ModelAndView("testbeanresult");
		modelAndView.addObject("testbean", testBean);
		return modelAndView;
	}

}
