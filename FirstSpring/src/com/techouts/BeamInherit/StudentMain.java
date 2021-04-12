package com.techouts.BeamInherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("Hello world");

		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) ap.getBean("bi");
		student.show();
	}

}
