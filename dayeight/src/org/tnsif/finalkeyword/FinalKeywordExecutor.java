package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) 
	{
		FinalVariable f=new FinalVariable();
		//f.SALARY=3343.78f;  we cannot the salary because it is final
		f.print();
		
		DELL d=new DELL();
		d.display();
		d.display(d.processor);
	}

}
