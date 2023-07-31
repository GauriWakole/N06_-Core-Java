package org.tnsif.decisionmaking;
import java.util.*;
public class Microwaave {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int item;
		double heattime;
		double total;
		
		System.out.println("Enter item in no and Heating time");
		item=sc.nextInt();
		heattime=sc.nextDouble();
		
		switch(item)
		{
			case 1:
				total=heattime;
				System.out.println(total);
				break;
				
			case 2:
				total=heattime;
				System.out.println(total);
				break;
				
			case 3:
				total=2*heattime;
				System.out.println(total);
				break;
				
			default:
				System.out.println();
				
				
		}
		

	}

}
