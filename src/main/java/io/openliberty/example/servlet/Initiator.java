package io.openliberty.example.servlet;

import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

public class Initiator implements ServletContainerInitializer {

    @Override
    public void onStartup (Set<Class<?>> pageClasses, ServletContext ctx)
              throws ServletException {
    	System.out.println("### Initiator ###");
    }
}		
		