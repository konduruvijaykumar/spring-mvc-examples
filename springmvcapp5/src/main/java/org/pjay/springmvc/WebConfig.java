/**
 * 
 */
package org.pjay.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author vijayk
 *
 */
@Configuration
// When we have beans specific to a servlet only
@ComponentScan(basePackages = {"org.pjay.springmvc.app"})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
	
}
