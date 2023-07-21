//Program to demnstrate on ternary operator

package org.tnsif.operators;
import java.util.*;

public class TernaryOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		String result=(num%2==0)?"Even":"odd";
		System.out.println("Result is: "+result);
		sc.close();
		

	}

}
