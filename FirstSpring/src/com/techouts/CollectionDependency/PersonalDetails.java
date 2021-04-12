package com.techouts.CollectionDependency;

import java.util.Set;

public class PersonalDetails 
{
	
	private String sibingname;
	private int height;
	private Set<Languages> la;
	public PersonalDetails(Set<Languages> la, String fatherName, int height) {
		super();
		this.la = la;
		this.sibingname = fatherName;
		this.height = height;
	}
	/*public void display()
	{
		for(Languages l:la)
		{
			System.out.println(l);
		}
		System.out.println("Sibling name: "+sibingname);
		System.out.println("height :"+height);
	}
*/
	@Override
	public String toString() {
		return " [ sibingname=" + sibingname + ", height=" + height+"," + "languages known=" + la + "]";
	}
	
	
}
