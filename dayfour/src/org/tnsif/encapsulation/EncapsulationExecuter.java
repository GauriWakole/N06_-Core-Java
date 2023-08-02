package org.tnsif.encapsulation;

public class EncapsulationExecuter 
{

	public static void main(String[] args) 
	{
		PUNB p=new PUNB();
		p.setAccType("Saving Acoount");
		p.setAccountNo(2536378339L);
		p.setAtmCardNo(372773738L);
		p.setPinNo(2611);
		
		
		//System.out.println("Account No. is: "+p.getAccountNo());
		//below line will call to toString method
		System.out.println(p);
		

	}

}
