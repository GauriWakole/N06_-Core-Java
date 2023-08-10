/*program to demonstrate on array using run time input values to find 
largest element in an array.*/

package org.tnsif.singledimensionalarray;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExampleRuntime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no. of array elements: ");
		int n=sc.nextInt();
		//array declaration
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element is: "+max);
		Arrays.sort(arr);
		System.out.println("Sorted elemennts are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}

	}

}
