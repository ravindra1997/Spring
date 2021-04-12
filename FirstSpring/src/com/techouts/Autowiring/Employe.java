package com.techouts.Autowiring;

public class Employe
{
	private int id;
	private String name;
	private String location;
	private College1 college;
	private College1 college2;
	public int getId() {
		return id;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public College1 getCollege() {
		return college;
	}
	public void setCollege(College1 college) {
		this.college = college;
	}
	
	public College1 getCollege2() {
		return college2;
	}
	public void setCollege2(College1 college2) {
		this.college2 = college2;
	}
	public void display()
	{
		System.out.println("Welcome :"+name);
		System.out.println("id no :"+id);
		System.out.println("Address :"+location);
		System.out.println("college details :");
		System.out.println("collge name :"+college.getCollName()+","+college2.getCollName());
		System.out.println("collge Id :"+college.getCollId()+","+college2.getCollId());
		System.out.println("collge Loaction :"+college.getCollLocation()+","+college2.getCollLocation());

	}

}
