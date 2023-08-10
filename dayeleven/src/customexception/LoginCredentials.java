//program to demonstrate on custom exception

package customexception;

/*To use custom exception extends an Exception class(Parent)*/
public class LoginCredentials extends Exception 
{
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	
	
	
	
}
