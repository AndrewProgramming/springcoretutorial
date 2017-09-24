package com.andrew;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext fileSysContext = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");
//        ApplicationContext fileSysContext = new WebXmlApplicationContext("src/main/resources/Beans.xml");
//        HelloWorld obj = (HelloWorld) fileSysContext.getBean("helloWorld");
//        obj.getMessage();


        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.setMessage("abc");
        obj.getMessage();

        HelloWorld obj2 = (HelloWorld) factory.getBean("helloWorld");
        obj2.setMessage("abcd");
        obj2.getMessage();

    }

}
