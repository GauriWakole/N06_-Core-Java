//program to demonstrate on super constructor

package org.tnsif.superkeyword;
//parent class
class Google
{
	String ceo;

	public Google(String ceo) 
	{
		System.out.println("Default Constructor: "+ceo);
	}
	
}
//child class
class Gmail extends Google
{
	String userid;

	public Gmail(String ceo, String usrid) 
	{
		//calling to parent class parameterized constructor
		super(ceo);
		this.userid = usrid;
		System.out.println(userid);
	}
	
}
//driver class
public class SuperKeywordWithConstructor 
{

	public static void main(String[] args) 
	{
		Gmail g=new Gmail("Gauri waykole","gauri@gmail.com");

	}

}
