import java.util.*;
public class PalindromeTester 
{
	public static boolean isPal(String str)
    {
        if(str.length() == 0 || str.length() == 1)
            return true; 
        
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPal(str.substring(1, str.length()-1));
        
        return false;
    }

    public static void main(String[]args)
    {
    	String another = "y";
    	
    	while(another.equalsIgnoreCase("y"))
    	{
    		Scanner sc = new Scanner(System.in);
    		System.out.println("type a word to check if it's a palindrome.");
    		String x = sc.nextLine();
    		if(isPal(x))
    			System.out.println(x + " is a palindrome.");
    		else
    			System.out.println(x + " is not a palindrome.");
        
    		System.out.println();
    		System.out.print("Test another palindrome (y/n)");
    		another = sc.nextLine();
        
    	}
    }
}