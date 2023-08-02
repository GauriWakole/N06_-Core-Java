//Program to demonstrate on access specifier

package in.kkwagh.library;
import in.bkcmet.library.*;

//driver class
public class FacultyExecuter 
{

	public static void main(String[] args) 
	{
		Library l=new Library();
		l.libraryName="Bhujbal Library";
		l.displayPublic();  //It is public so we can access it in different packaage
		
		
		/*userID and displayPrivate() method is private, so 
		 * we cant access into another package or class, only
		 * we can access inside the same class
		 */
		//l.userId=123456;
		//l.displayPrivate();
		
		
		/*booksName and displayDefault() method id default,
		 * we cant access into another package, only we can access
		 * it within the same package
		 */
		//l.booksName;
		//l.displayDefault();
	}

}
