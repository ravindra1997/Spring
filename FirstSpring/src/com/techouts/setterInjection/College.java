package com.techouts.setterInjection;

import java.util.Map;

public class College 
{
	private String universityName;
	private String universityLocation;
	private int uniId;
	private Map<String,String> mp;
	//public College(){}
	
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getUniversityLocation() {
		return universityLocation;
	}
	public void setUniversityLocation(String universityLocation) {
		this.universityLocation = universityLocation;
	}
	public int getUniId() {
		return uniId;
	}
	public void setUniId(int uniId) {
		this.uniId = uniId;
	}
	public Map<String, String> getMp() {
		return mp;
	}
	public void setMp(Map<String, String> mp) {
		this.mp = mp;
	}
	public void display()
	{
		System.out.println("university name:");
		System.out.println(universityName);
		System.out.println("university location:");
		System.out.println(universityLocation);
		System.out.println("university id:");
		System.out.println(uniId);
		System.out.println("And Colleges Under it:");
		for(Map.Entry<String, String> m:mp.entrySet())
		{
			System.out.println("collegeId:");
			System.out.println(m.getKey());
			System.out.println("college Name:");
			System.out.println(m.getValue());
		}
		
	}
	

}
