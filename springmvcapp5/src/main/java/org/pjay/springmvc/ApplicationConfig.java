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
 * https://stackoverflow.com/questions/31835033/web-xml-is-missing-and-failonmissingwebxml-is-set-to-true
 * https://www.youtube.com/watch?v=-pV351E_stM
 * https://kielczewski.eu/2013/11/spring-mvc-without-web-xml-using-webapplicationinitializer/
 * https://www.youtube.com/watch?v=MNgliKze8oI
 * https://stackoverflow.com/questions/7801155/how-to-run-tomcat-7-using-maven-2-tomcat-plugin
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
