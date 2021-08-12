import java.util.ArrayList;

public class CustomerLister 
{

	 public static void main(String[] args)
	 {
	 ArrayList<String> CustomerName = new ArrayList<String>();
	 CustomerName.add("Cathy");
	 CustomerName.add("Ben");
	 CustomerName.add("Jorge");
	 CustomerName.add("Wanda");
	 CustomerName.add("Freddie");
	 
	 int index =0;
	 
	 while (index < CustomerName.size())
		 
	 	{
		 	System.out.println(CustomerName.get(index));
		 	index++;
	 	}
	 
	 ArrayList<Double> CustomerBalance = new ArrayList<Double>();
	 CustomerBalance.add((double) 625);
	 CustomerBalance.add((double) 200);
	 CustomerBalance.add((double) 2500);
	 CustomerBalance.add((double) 3113);
	 CustomerBalance.add((double) 745);
	 	
	 int wallet = 0;
	
	 while (wallet < CustomerBalance.size())
		 
		 {
		 	System.out.println(CustomerBalance.get(wallet));
		 	wallet++;
		 }
	 
	 }
}