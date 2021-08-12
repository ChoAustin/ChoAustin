import java.util.Scanner;

public class SmallestInt
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a value for x: ");
      int x = scan.nextInt();
      System.out.println("Enter a value for y: ");
      int y = scan.nextInt();
      System.out.println("Enter a value for z: ");
      int z = scan.nextInt();
      if (z >= x)
         System.out.println("The bigger value was " + z);
      else
    	  if (x >= y)
         System.out.println("The bigger value was " + x);
    	  else 
    		  if (y >= z)
    			  System.out.println("The bigger value was " + y);

   }
}
