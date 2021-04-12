package com.techouts.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args){
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	A a=applicationContext.getBean("proxy",A.class);

	a.m();
	}
}
