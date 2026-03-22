//package com.in28minutes.spring_boot.myfirstwebapp.config;
//
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.h2.server.web.JakartaWebServlet;
//
//@Configuration
//public class H2ConsoleConfig {
//
//    @Bean
//    public ServletRegistrationBean<JakartaWebServlet> h2ServletRegistration() {
//    	 ServletRegistrationBean<JakartaWebServlet> registrationBean =
//                 new ServletRegistrationBean<>(new JakartaWebServlet());
//
//         registrationBean.addUrlMappings("/h2-console/*");
//         return registrationBean;
//    }
//
//}
