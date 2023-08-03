//program to demonstrate on final keyword

package org.tnsif.finalkeyword;

public class FinalVariable {
	
	/*Final variable must be initialize during declaration*/
	//final int x;
	
	final float SALARY=30000.56f;
	
	void print()
	{
		/*we cant the change the value of the final variable*/
		//SALARY=600000.34f;
		System.out.println("Salary is: "+SALARY);
	}
}

