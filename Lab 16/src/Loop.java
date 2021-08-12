import java.util.*;
public class Loop
{
	
	
   public static void main (String[] args)
   {
	   int num = 0;
	   
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("enter a integer: ");
	   num = scan.nextInt();
	   
	   
	    for(int i = 0; i < num; i++)
      {
	    	i += num + 2 + 3;
		   System.out.println(i);         
      }
   }
}