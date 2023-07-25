//Program to demonstrate on class and objects

package org.tnsif.classandobject;

//class declaration
public class Employee 
{
	//default data members
	int empID;
	String empName;
	float salary;
	String department;
	
	//method declaraion
	void display()
	{
		System.out.println("Emp ID: "+empID);
		System.out.println("Emp Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
	}
}
