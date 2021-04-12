package com.techouts.dependencyInjection;

public class Employe
{
	private int id;
	private String name;
	private String disignation;
	private Address add;
	public Employe(int id, String name, String disignation, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.disignation = disignation;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", disignation=" + disignation + ", add=" + add + "]";
	}
	
	

}
