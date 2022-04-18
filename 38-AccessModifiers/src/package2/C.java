package package2;
import package1.*;

public class C {
	
	String defaultMessage = "This is the default";
	
	//	The only classes that have access to this default message, are the classes within the same package. 
	//	Even though they can "import" different packages. "default" makes it invisible to other packages that aren't package2.
	
	public String publicMessage = "This is public";
	
	//	anything that uses the "public" keyword is visible to any packages
	
	protected String protectedMessage = "This is protected";
	
	//	the "protected" keyword makes it so that it can be accessible to a different package, from a different class
	
	private String privateMessage = "This message is private";
}
