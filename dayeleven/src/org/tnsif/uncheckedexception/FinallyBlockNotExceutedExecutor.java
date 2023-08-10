//program to demonstrate on finally block is not executed

package org.tnsif.uncheckedexception;

public class FinallyBlockNotExceutedExecutor 
{
	static void display(int arr[])
	{
		try 
		{
		System.out.println(arr[3]);
		/* if try and catch block contains an System.exits(0);
		 * after the exception code line then finally block
		 * does not exits
		 */
		System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled"+e);
			System.exit(0);
		}
		finally
		{
			/* when finnaly block contains an exception code,then
			 * finally block does not execute
			 */
			//System.out.println(13/0);
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


