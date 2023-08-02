//program to demonstrate on static block

package org.tnsif.statickeyword;

public class StaticBlockExecutor 
{
	
	static String str;
	static float salary;
	/*Static block is used to initialize static variable
	 * and we cannot initialize any non-static variable 
	 * inside the static block
	 */
	static
	{
		salary=34435.56f;
		//str=BKC;
		System.out.println(salary);
		
	}
	

	public static void main(String[] args) 
	{
		
		/*Main function is static and hence it calls static block, mehod 
		 * and variable by default
		 */
	}

}
