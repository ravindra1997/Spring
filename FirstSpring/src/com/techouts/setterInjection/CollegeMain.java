package com.techouts.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeMain {
	public static void main(String args[]) {
		System.out.println("Hello world");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		College college = (College) applicationContext.getBean("coll");
		college.display();
	}

}
