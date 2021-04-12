package com.techouts.firstSpring;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain
{
	public static void main(String args[])
	{
		System.out.println("hello world");
		
//		Resource resource=new ClassPathResource("applicationContext.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		Employeee employeee=(Employeee) beanFactory.getBean("emp");
		
		
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employeee employeee =(Employeee) ap.getBean("emp");
		System.out.println(employeee.getId());
		System.out.println(employeee.getName());
	}

}
