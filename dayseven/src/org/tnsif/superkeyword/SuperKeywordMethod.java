package org.tnsif.superkeyword;
//parent class
class MET
{
	String ownerName="Changan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is: "+ownerName);
	}
}
//child class
class BKC extends MET
{
	String chairman="Shefali Bhujbal";
	void displayName()
	{
		/*if parent class and child class method name is same and if u want to access 
		 * that method then use super.methodName()
		 */
		super.displayName();
		System.out.println("chairman is: "+chairman);
	}
}
//driver class
public class SuperKeywordMethod {

	public static void main(String[] args) 
	{
		BKC b=new BKC();
		b.displayName();
	}

}
