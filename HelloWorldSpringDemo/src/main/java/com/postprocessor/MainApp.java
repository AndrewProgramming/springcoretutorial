package com.postprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    com.postprocessor.HelloWorld obj = (HelloWorld) context.getBean("helloWorldPost");



}
