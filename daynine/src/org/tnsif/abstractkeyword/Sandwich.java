package org.tnsif.abstractkeyword;

public abstract class Sandwich 
{
	//concrete method
	void showReceipe()
	{
		System.out.println("I don,t know how to"+ "prepare sandwich");
	}
	//abstract method
	abstract void prepare();
	
}
