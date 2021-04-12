package com.techouts.CollectionDependency;

import java.util.List;

public class Student {
	
	private long phone;
	private String name;
	private String college;
	private String loc;
	private List<String> degree;
	private List<PersonalDetails> pd;
	public Student(long phone, String name, String college, String loc, List<String> degree,List<PersonalDetails> p) {
		super();
		this.phone = phone;
		this.name = name;
		this.college = college;
		this.loc = loc;
		this.degree = degree;
		this.pd=p;
	}

	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Phonenumber: "+phone);
		System.out.println("college: "+college);
		System.out.println("degrees he has :");
		
		for(String s:degree)
		{
			System.out.println(s);
		}
		System.err.println("Persoinal Details are :");
		for(PersonalDetails p:pd)
		{
			System.out.println(p);
		}
	}

}
