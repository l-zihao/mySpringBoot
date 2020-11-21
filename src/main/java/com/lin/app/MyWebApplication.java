package com.lin.app;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/19 17:24
 */
public class MyWebApplication implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext =
                new AnnotationConfigWebApplicationContext ();
        annotationConfigWebApplicationContext.register(Appconfig.class);
        annotationConfigWebApplicationContext.refresh();


        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigWebApplicationContext);
        ServletRegistration.Dynamic registration = servletContext.addServlet("xxx", dispatcherServlet);
        registration.addMapping("/");
        //设置启动顺序，让spring加载时执行init方法
        registration.setLoadOnStartup(1);
    }
}
