//program to demonstrate on ArrayIndexoutOfBound Exception

package org.tnsif.uncheckedexception;
import java.util.*;
public class ArrayIndexoutOfBound {
	
	static void display(int arr[])
	{
		try 
		{
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled"+e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement outside the block is always executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		display(arr);
	}

}
