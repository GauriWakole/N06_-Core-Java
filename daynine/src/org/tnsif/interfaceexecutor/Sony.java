//progarm to demonstrate on interface

package org.tnsif.interfaceexecutor;

public interface Sony 
{
	/*by default all the variables inside an interface
	 * is public static final
	 */
	int noofchannels=6;
	
	//abstract method
	//by default all the method inside an interface is an abstract method
	void display();
	
	static void accept()
	{
		System.out.println("Static method");
	}
	//default method
	default void show()
	{
		System.out.println("Default method");
	}
}
