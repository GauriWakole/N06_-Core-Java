//program to demonstrate on final method

package org.tnsif.finalkeyword;
//parent class
//final class cant be inherit from child cass
//public final class Laptop 
public class Laptop 
{
	final String processor="Intel i5";
	
	//final method
	final void display()
	
	{
		System.out.println(processor);
	}
}
