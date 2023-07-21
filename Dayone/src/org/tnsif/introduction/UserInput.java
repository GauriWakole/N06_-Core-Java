//program to demonstrate on user-input value
package org.tnsif.introduction;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=sc.next();
		System.out.println("string is: "+str1);
	
		//nextLine
		System.out.println("Enter the string: ");
		String str2=sc.nextLine();
		System.out.println("string is: "+str2);
	
	
		//nextInt
		System.out.println("Enter the Integer: ");
		int num=sc.nextInt();
		System.out.println("string is: "+num);
	

		//next().charAt()
		System.out.println("Enter the character: ");
		char c=sc.next().charAt(0);
		System.out.println("string is: "+c);
	
	}
}
