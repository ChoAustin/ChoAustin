import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Deli
{
	public static void main (String[] args)
	{
		final double OUNCES_PER_POUND = 16.0;
		double pricePerPound; // price per pound
		double weightOunces; // weight in ounces
		double weight; // weight in pounds
		double totalPrice; // total price for the item
		Scanner scan = new Scanner(System.in);
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		
// prompt the user and read in each input		
System. out. println ("Welcome to the CS Deli! ! \n ");
		System.out.print ("Enter the price per pound of your item: ");
		pricePerPound = scan.nextDouble();
		System.out.print ("Enter the weight (ounces): ");
		weightOunces = scan.nextDouble();
		
		// Convert ounces to pounds and compute the total price
		weight = weightOunces / OUNCES_PER_POUND;
		totalPrice = pricePerPound * weight;
		System.out.println("total: " + fmt.format(totalPrice));
		System.out.println("total: " + fmt.format());
		
// Print the label using the formatting objects
		// fmt for the weight in pounds and money for the prices
		
	}
}
