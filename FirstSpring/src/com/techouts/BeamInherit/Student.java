package com.techouts.BeamInherit;

public class Student
{
	private String name;
	private String mail;
	private Address ad;
	
	
	public Student(String name,String mail)
	{
		this.name=name;
		this.mail=mail;
	}
	public Student(String name,Address ad)
	{
		this.ad=ad;
		this.name=name;
	}
	
	public void show()
	{
		System.out.println(name+" "+mail);
	}
}
