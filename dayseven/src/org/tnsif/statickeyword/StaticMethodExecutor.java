//progranm to demonstrate on static keyword method

package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	
	static float percentage=78.9f;
	//static method
	/*if any method is outside the main function and if you want to access
	 * the method inside the main function, make it as static
	 */
	static void displayScore(int score)
	{
		System.out.println();
		/*we cant use non static variable inside the static method
		 */
		System.out.println("Score is: "+score);
	}

	public static void main(String[] args) 
	{
		displayScore(56);

	}

}
