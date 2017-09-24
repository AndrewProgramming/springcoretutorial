package com.lifecycle;

import com.lifecycle.HelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        com.lifecycle.HelloWorld obj = (HelloWorld) context.getBean("helloWorldLifecycle");
        obj.getMessage();
        //must call this method to register graceful shutdown
        context.registerShutdownHook();


    }
}
