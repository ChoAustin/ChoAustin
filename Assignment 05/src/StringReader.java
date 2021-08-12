import java.util.Scanner;
//PP 11.1 and PP11.2
public class StringReader 
{
	public static void main(String[] args) throws StringTooLongException
	{
		
		final int MaxStringLength = 20;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter strings, enter DONE when finished:\n");
		String str1 = scan.nextLine();
		
		if(str1.equalsIgnoreCase("done"))
			return;
		 do
		 {
			 try
	         {
				 if(str1.length()>MaxStringLength)
					 throw new StringTooLongException();
	                	System.out.println("\nEnter a string, enter DONE when finished:\n");
	                	str1 = scan.nextLine();            
	         }
	            catch(StringTooLongException e)
	            {
	            	System.out.println(e.getMessage());
	            	str1 = scan.nextLine();
	            }
	       }
		 while(!str1.equalsIgnoreCase("done"));
	        scan.close();
	}
}
