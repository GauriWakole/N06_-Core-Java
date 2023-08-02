package org.tnsif.statickeyword;
class Employee
{
	private int empID;
	private String name;
	//static variable
	private static String companyName="TNSIF";
	public int getEmpID() 
	{
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	//Method
	public void display()
	{
		System.out.println("Emp ID: "+this.getEmpID()+" "+"Emp Name:"+this.getName()+" "+"Comapny Name: "+this.getCompanyName());
	}
	
}
//driver class
public class StaticVariable {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpID(1);
		e.setName("Gauri");
		e.display();
		
		Employee e1=new Employee();
		e1.setEmpID(2);
		e1.setName("Abhi");
		e1.display();
		

	}

}
