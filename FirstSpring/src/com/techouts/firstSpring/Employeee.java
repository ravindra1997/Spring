package com.techouts.firstSpring;

public class Employeee 
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	
	public Employeee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
