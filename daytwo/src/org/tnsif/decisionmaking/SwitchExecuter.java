//Program to demonstrate switch case

package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchExecuter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the songno:");
		int songno=sc.nextInt();
		switch(songno)
		{
			case 1:
				System.out.println("Waka waka Song");
				break;
			case 2:
				System.out.println("Taki Taki");
				break;
			case 3:
				System.out.println("Jai shree ram");
				break;
			default:
				System.out.println("Wrong songno plz check ur songno");
		}

	}

}
