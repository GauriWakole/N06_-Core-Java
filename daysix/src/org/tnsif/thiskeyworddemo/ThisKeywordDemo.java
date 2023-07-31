//program to demonstrate on :
//this keyword is use to refer current instance of the class

package org.tnsif.thiskeyworddemo;
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
		
	}
}


public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		Account a=new Account();
		a.setData(3237487364L);
		a.display();
	}

}
