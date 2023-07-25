package org.tnsif.looping;
import java.util.Scanner;

public class TotalNumDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String num=sc.next();
		
		int count=0;
		int n=num.length();
		
		for(int i=1;i<=n;i++)
		{
			count++;
		}
		System.out.println(count);

	}

}





































