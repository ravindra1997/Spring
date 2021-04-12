package com.techouts.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employe employe=(Employe)applicationContext.getBean("emp1");
		employe.display();
	}
}
