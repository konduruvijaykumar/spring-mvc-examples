/**
 * 
 */
package org.pjaygroup.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vijay Konduru
 *
 */
//@Component // Not mandatory if component-scan tag user this package (Ex: <context:component-scan base-package="org.pjaygroup.springmvc.controller"/>)
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView greetHello() {
		return new ModelAndView("hello", "message", "Hello from server... ");
	}
	
	@RequestMapping(path="/hello/{name}", method={RequestMethod.GET})//Use path or name // by default method is GET if not specified.
	public ModelAndView greetHelloUser(@PathVariable("name") String name) {
		return new ModelAndView("hello", "message", "Hi " + name + ". How are you?");
	}
	
}
