package com.techouts.dependencyInjection;

public class Address 
{
	private int dno;
	private String vill;
	private String dist;
	public Address(int dno, String vill, String dist) {
		super();
		this.dno = dno;
		this.vill = vill;
		this.dist = dist;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", vill=" + vill + ", dist=" + dist + "]";
	}

	
	



}
