package customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the user Id: ");
		String userid=s.nextLine();
		System.out.println("Enter the Password: ");
		String password=s.nextLine();
	try {
			if(userid.equals("gauriwaykole@a.org") && password.equals("Gauri@26"))
			{
			System.out.println("Credentials are matched!!!");
			}
			else
			{
			throw new LoginCredentials("Invalid Credentials");
			}
		}
	catch(LoginCredentials e)
		{
			System.out.println("Exception handled:"+e);
		}
	}

}
