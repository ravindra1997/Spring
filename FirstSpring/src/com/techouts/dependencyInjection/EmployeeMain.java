package com.techouts.dependencyInjection;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain {

	public static void main(String[] args) {

		//System.out.println("Hello world");

//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		Employe employe = (Employe) beanFactory.getBean("emps");
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employe employe=(Employe)ap.getBean("emps");
		System.out.println(employe);
		
	}
}