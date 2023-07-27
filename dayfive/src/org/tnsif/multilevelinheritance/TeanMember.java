package org.tnsif.multilevelinheritance;
//child class
public class TeanMember extends TeamLead 
{
	//private data members
	private int size;
	private int duration;
	
	
	//getter and setter
	public int getSize() 
	{
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


	//parameterized constructor
	public TeanMember(String deptName, String name, int empID, String leadName, String projectName,int size,int duration) {
		super(deptName, name, empID, leadName, projectName);
		this.size=size;
		this.duration=duration;
		
	}



	@Override
	public String toString() 
	{
		return "TeanMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
