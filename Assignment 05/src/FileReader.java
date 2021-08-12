import java.util.Scanner;
//PP 11.3 and 11.4
public class FileReader 
{
	public static void main(String[] args) throws InvalidDocumentCodeException
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the designation for the document,\n\nenter CLOSE when finished:\n");
		String str1 = scan.nextLine();
		
		if(str1.equalsIgnoreCase("close"))
			return;
		do
		{
			try
			{
				if(!str1.startsWith("U")&&!str1.startsWith("C")&&!str1.startsWith("P"))
					throw new InvalidDocumentCodeException();
                		System.out.println("\nEnter a string, enter CLOSE when finished:\n");
                		str1 = scan.nextLine();
			}
            	catch(InvalidDocumentCodeException e)
            {
            	System.out.println(e.getMessage());
            	str1 = scan.nextLine();
            }
       }
	 while(!str1.equalsIgnoreCase("close"));
        scan.close();
	}
}

