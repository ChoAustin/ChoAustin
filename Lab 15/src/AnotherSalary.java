import java.util.Scanner;
import java.text.NumberFormat;
public class AnotherSalary
{
	public static void main (String[] args)
	{
		double currentSalary; // employee's current salary
		double raise = 0; // amount of the raise
		double newSalary; // new salary for the employee
		
		String rating; // performance rating
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
		rating = scan.next(); 
		
		switch(rating)
		{
		case "Excellent":
			raise =(0.6 * currentSalary);
			break;
			
		case "Good":
			raise = (0.4 * currentSalary);
			break;
			
		case "Poor":
			raise = (0.015 * currentSalary);
			break;
			default:
				System.out.println("Invalid");
		}
		newSalary = currentSalary + raise;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println( "Your new salary: " + money. format (newSalary) );
		System.out.println();
	}
}
