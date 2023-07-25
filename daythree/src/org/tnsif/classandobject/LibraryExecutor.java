//driver class
//Program to demonstrate on default and parameterized constructor

package org.tnsif.classandobject;

public class LibraryExecutor {

	public static void main(String[] args) 
	{
		//object creation
		Library l=new Library();
		Library l1=new Library(5,"Gauri Waykole","Java Programming",250.5);
		
		System.out.println(l1);
		
		

	}

}
