package org.tnsif.uncheckedexception;

public class CatchBlockDemo {
	
	static void print(int arr[])
	{
		try
		{
			System.out.println(arr[3]);
		}
		/*It is giving priority to first child class eg.It gives priority to (exception e)
		and then parent class eg.(ArrayIndexOutOfBoundsException)*/
		//we can use multiple catch block
		catch(ArithmeticException  | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
		}
		//
		/*catch(NullPointerException e)
		{
			System.out.println(e);
		}*/
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		print(arr);

	}

}
