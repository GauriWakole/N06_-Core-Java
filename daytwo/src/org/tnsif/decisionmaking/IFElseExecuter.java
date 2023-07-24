/*Program to demonstrate or not using if....else*/

package org.tnsif.decisionmaking;
import java.util.Scanner;

public class IFElseExecuter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age: ");
		int age=sc.nextInt();
		System.out.println("Enter ur weight: ");
		int weight=sc.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}

}
