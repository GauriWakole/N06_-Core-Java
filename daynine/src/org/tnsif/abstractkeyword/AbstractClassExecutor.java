package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		/*we cannot create the object for the class*/
		//Sandwich s=new Sandwich();
		
		CheeseSandwich ch=new CheeseSandwich();
		ch.prepare();
		ch.showReceipe();
	}

}
