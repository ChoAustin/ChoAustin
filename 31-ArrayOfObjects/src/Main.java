
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[4];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		Food[] menu = new Food[4];
		
		Food item1 = new Food("pizza");
		Food item2 = new Food("cheese burger");
		Food item3 = new Food("hotdog");
		
		//Food[] refrigerator = {food1, food2, food3};
		//using the code on line 19 would make codes 22-24 not needed for this to work
	
		menu[1] = item1;
		menu[2] = item2;
		menu[3] = item3;
		
		//System.out.println("enter a number from 1-3: ");
		//int n = scanner.nextInt();
		
		String Done;
		String Ordering;
		String Cancel;
		String status = "Order";
		String response = "N";
		
		while(status == "Order") {
			
			System.out.println("Please type Order to proceed or Done to stop: ");
			status = scanner.nextLine();
			
			System.out.println("What would you like to order on the menu from 1-3: ");
			int item = scanner.nextInt();
			
			if(item == 1) 
			{
				System.out.println("You have ordered the item: " + menu[1].name);
			}
			else if(item == 2)
			{
				System.out.println("You have ordered the item: " + menu[2].name);
			}
			else
			{
				System.out.println("You have ordered the item: " + menu[3].name);
			}
			
			//System.out.println("Would you like to order another item? (Y/N): ");
			//response = scanner.nextLine();
			
			//while(response != "N")
			//{
			//	if(item == 1) 
			//	{
			//		System.out.println("You have ordered the item: " + menu[1].name);
			//	}
			//	else if(item == 2)
			//	{
			//		System.out.println("You have ordered the item: " + menu[2].name);
			//	}
			//	else
			//	{
			//		System.out.println("You have ordered the item: " + menu[3].name);
			//	}
			//}
			System.out.println("Have you finished your order? if so please type: Done");
			status = scanner.nextLine();
		}
	
	}
	
}
