
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
			
		// exception = an event that occurs during the execution of a program that,
		//			   disrupts the normal flow of instructions
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole numberto divide by: ");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("result: " + z);
		}
		catch(ArithmeticException e) {
			System.out.println("Dividing by 0 is not possible!");
		}
		catch(InputMismatchException e) {
			System.out.println("you need to input a number not a word");
		}
		catch(Exception e) {
			// best to use this method when you can't figure it out. better to look for the "exact exception you are writing"
		}
		finally{
			//System.out.println("This will always print");
			scanner.close();
		}
	}
}
