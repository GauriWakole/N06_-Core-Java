package org.tnsif.uncheckedexception;

public class ThrowandThrowsLeywordDemo {
	
	 static void isEligible(int age, int weight)throws ArithmeticException
	{
		if(age>18 && age>50)
		{
			System.out.println("Person is eligible to donate the blood");
		}
		else
		{
			//throw keyword is used to throw an exception explicitly
			throw new ArithmeticException("Criteria is not satisfied");
		}
	}

	public static void main(String[] args)  
	{
		int age=15;
		int weight=40;
		
		isEligible(age,weight);
		/*
		 *If we use try and catch the o/p will come in black line,
		 *and if we use throws then o/p will come in red line
		 * try
		 * {
		 * 	isEligible(13,55)
		 * }
		 * catch(Exception e)
		 * {
		 * 	System.out.println(e);
		 * }
		 * */

	}

}
