package com.techouts.FactoryDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMain {
	public static void main(String[] args) {
		System.out.println("Hello world");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.Xml");
		Run r = (Run) applicationContext.getBean("run");
		r.runs();
	}

}
