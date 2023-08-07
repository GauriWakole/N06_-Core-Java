package org.tnsif.interfaceexecutor;

public class Human implements ColdDrinks,AlchoholDrinks
{

	@Override
	public void showDrink() 
	{
		System.out.println(colddrinkName+" "+ aclchoholType+" "+brand);
	}

}
