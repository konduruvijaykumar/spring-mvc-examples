/**
 * 
 */
package org.pjay.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author vijayk
 *
 */
public class WebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext rootContext = getGlobalApplicationContext();
		servletContext.addListener(new ContextLoaderListener(rootContext));
		WebApplicationContext servletConfig = getServletApplicationContext();
		ServletRegistration.Dynamic applicationServlet = servletContext.addServlet("dispacher", new DispatcherServlet(servletConfig));
		// if using xml or any other init parameters, can even set a map of parameters at once
		//applicationServlet.setInitParameter("contextConfigLocation", "/WEB-INF/springmvc-app5-servlet.xml");
		applicationServlet.setLoadOnStartup(1);
		applicationServlet.addMapping("/");
	}
	
	// Total application or root or jvm level context
	private AnnotationConfigWebApplicationContext getGlobalApplicationContext() {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		//rootContext.register(ApplicationConfig.class);
		rootContext.register(new Class[] {ApplicationConfig.class});
		return rootContext;
	}
	
	// Servlet level context
	private AnnotationConfigWebApplicationContext getServletApplicationContext() {
		AnnotationConfigWebApplicationContext servletConfig = new AnnotationConfigWebApplicationContext();
		servletConfig.register(WebConfig.class);
		return servletConfig;
	}
	
	// You can write with location of config classes with package location and register as context loader listeners
	// https://kielczewski.eu/2013/11/spring-mvc-without-web-xml-using-webapplicationinitializer/
	// https://www.youtube.com/watch?v=-pV351E_stM

}
