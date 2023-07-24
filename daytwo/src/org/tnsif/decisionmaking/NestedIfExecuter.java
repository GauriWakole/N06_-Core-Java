//Program to demonstrate on bunjee jumping using nested if

package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIfExecuter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter weight: ");
		int weight=sc.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bunjee jumping");
				if(weight>110)
				{
					System.out.println("Extra ropes will be aded");
				}
			}
			else
			{
				System.out.println("Not eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not eligible for bunjee jumping");
		}
		
	}

}
