package org.tnsif.hierarchicalinheritance;
//child class 1
public class Tiramisu extends Android
{
	
	//private data members
	private int version;
	
	
	//getter and setter
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}



	//parameterized constructor
	public Tiramisu(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
	}
	
	//to string
	@Override
	public String toString() 
	{
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
}
