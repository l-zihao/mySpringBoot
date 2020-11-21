package com.lin.initializer;

import com.lin.app.web.SpringServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/19 21:27
 */
/*@HandlesTypes(HttpServlet.class)*/
public class MyInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic registration=servletContext.addServlet("xx",new SpringServlet());
        registration.addMapping("/");
    }
}
