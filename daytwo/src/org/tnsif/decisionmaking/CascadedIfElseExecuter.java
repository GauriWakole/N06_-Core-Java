//program to demonstrate on cascaded if.....else statement

package org.tnsif.decisionmaking;
import java.util.Scanner;

public class CascadedIfElseExecuter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age1=sc.nextInt();
		int age2=sc.nextInt();
		int age3=sc.nextInt();
		if(age1>age2 && age1>age3)
		{
			System.out.println("Age1 is greater:"+age1);
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("Age2 is greater:"+age2);
		}
		else
		{
			System.out.println("Age3 is greater:"+age3);
		}
		
		

	}

}
