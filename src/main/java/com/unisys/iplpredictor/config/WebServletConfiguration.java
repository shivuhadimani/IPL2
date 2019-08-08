package com.unisys.iplpredictor.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SuppressWarnings("unused")
public class WebServletConfiguration implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		 AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
	        webCtx.register(SpringConfig.class);
	        webCtx.setServletContext(servletContext);
	        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webCtx));
	        servlet.setLoadOnStartup(1);
	        servlet.addMapping("/");
		
	}

}
