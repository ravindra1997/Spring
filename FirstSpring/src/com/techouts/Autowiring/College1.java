package com.techouts.Autowiring;

public class College1 
{
	private int collId;
	private String collName;
	private String collLocation;
	public int getCollId() {
		return collId;
	}
	public void setCollId(int collId) {
		this.collId = collId;
	}
	public String getCollName() {
		return collName;
	}
	public void setCollName(String collName) {
		this.collName = collName;
	}
	public String getCollLocation() {
		return collLocation;
	}
	public void setCollLocation(String collLocation) {
		this.collLocation = collLocation;
	}
	@Override
	public String toString() {
		return "College1 [collId=" + collId + ", collName=" + collName + ", collLocation=" + collLocation + "]";
	}
	

}
