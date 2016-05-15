package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext appContext=new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA=(HelloWorld)appContext.getBean("objA");
		objA.getMessage();
		
		HelloWorld objB=(HelloWorld)appContext.getBean("objB");
		objB.getMessage();
		
		appContext.registerShutdownHook();
	}

}
