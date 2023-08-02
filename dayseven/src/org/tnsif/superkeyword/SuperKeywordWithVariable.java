package org.tnsif.superkeyword;
//program to demonstrate on keyword with variable
class Building
{
	int floors=23;
	String name="Anatha-Astha";
}
class Flat extends Building
{
	String name="Gauri Waykole";
	
	void print()
	{
		/*if parent class and child class variable name are same,
		 * and if you want to access parent class variable inside child class,
		 * use super.variablename
		 */
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeywordWithVariable 
{

	public static void main(String[] args) 
	{
		Flat f=new Flat();
		//System.out.println(f.name);
		f.print();
		
	}

}
