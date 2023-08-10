package org.tnsif.checkexception;
import java.io.FileInputStream;
public class CheckedExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f=new FileInputStream("D:\\download\\08_EDE_01.pdf");
			System.out.println("File is exits!!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception handles"+e);
		}
	}
}
