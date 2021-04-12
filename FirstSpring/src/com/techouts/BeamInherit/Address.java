package com.techouts.BeamInherit;

public class Address {
	private int id;
	private String city;
	private String country;

	public Address(int id, String city, String country) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + "]";
	}

}
