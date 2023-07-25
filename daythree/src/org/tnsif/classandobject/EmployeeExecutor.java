//driver class
//program to demonstrate on class and object

package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) 
	{
		//object creation
		Employee e=new Employee();
		e.empID=1234;
		e.empName="Gauri waykole";
		e.salary=900000;
		e.department="Comp";
		//method call
		e.display();

	}

}
