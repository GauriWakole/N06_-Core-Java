//program to demonstrate on Array of Objects
//driver class

package org.tnsif.singledimensionalarray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Employess arr[]=new Employess[3];
		arr[0]=new Employess(101,"Gauri",90000.45);
		arr[1]=new Employess(102,"Teju",70000.45);
		arr[2]=new Employess(103,"Nid",60000.45);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
	}

}
