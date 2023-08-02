package in.bkcmet.library;

public class Library 
{
	
	//Different access specifier
	public String libraryName;
	private long userID;
	String booksName;
	
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name: "+libraryName);
	}
	//Private method
	private void displayPrivate()
	{
		System.out.println("User Id: "+userID);
	}
	//default method
	void displayDefault()
	{
		System.out.println("Books Name: "+booksName);
	}
	
}
