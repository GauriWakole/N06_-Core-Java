package org.tnsif.looping;
import java.util.Scanner;

public class WhileLoop 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		//Printing num to 1
		while(num>=1)
		{
			System.out.println(num+" ");
			num--;
		}
		
	}

}
