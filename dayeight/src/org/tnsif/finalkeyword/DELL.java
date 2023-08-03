package org.tnsif.finalkeyword;

public class DELL extends Laptop 
{
	final String processor="Intel i7";
	
	//final method
	/*we cant override final method*/
	/*void display()
	
	{
		System.out.println(processor);
	}*/
	
	void display(String processor)
	{
		System.out.println(processor);
	}
}
