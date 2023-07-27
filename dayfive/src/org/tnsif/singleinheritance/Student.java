package org.tnsif.singleinheritance;

public class Student extends Citizen
{
	//private data members
	private int rollno;
	private String collegeName;
	
	//getter and setter
	public int getRollo() {
		return rollno;
	}
	public void setRollo(int rollo) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	//parameterized constructor
	public Student(String city, int pincode, String area, long adharNo,int rollno,String collegeName) {
		super(city, pincode, area, adharNo);
		this.rollno=rollno;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() 
	{
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
