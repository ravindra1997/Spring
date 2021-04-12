package com.techouts.Map;

public class User {
	private int id;
	private String name;
	private String loctaion;

	public User(int id, String name, String loctaion) {
		super();
		this.id = id;
		this.name = name;
		this.loctaion = loctaion;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", loctaion=" + loctaion + "]";
	}

}
