/**
 * 
 */
package org.pjay.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author vijayk
 *
 */
@Configuration
//When we have beans specific to complete application or global or jvm
@ComponentScan(basePackages = {"org.pjay.springmvc.global"})
public class ApplicationConfig {
	
	// This can be done at specific servlet level using the same way in WebConfig class
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

}
