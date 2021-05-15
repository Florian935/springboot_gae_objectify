package com.server.appengine.config;

import com.googlecode.objectify.ObjectifyService;
import com.server.appengine.entity.Employee;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ObjectifyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ObjectifyService.init();
        ObjectifyService.register(Employee.class);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) { }
}
