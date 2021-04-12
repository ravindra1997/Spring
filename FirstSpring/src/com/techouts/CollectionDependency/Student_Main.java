package com.techouts.CollectionDependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Student_Main {

	public static void main(String args[]){
		System.out.println("Hello world");
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Student student=(Student)beanFactory.getBean("stu");
		student.display();
		
	}
}
