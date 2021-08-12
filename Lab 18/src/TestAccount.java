
public class TestAccount 
{	
	public static void main(String[] args)
	{
	Account acct1 = new Account(102.56,"Ted Murphy", 72354);
	Account acct2 = new Account(100.00,"Billy Wake");
	Account acct3 = new Account("Julian");
	Account acct4 = new Account();
	
	System.out.println();
	System.out.println(acct1);
	acct1.withdraw(25.85);
	
	System.out.println();
	System.out.println(acct2);
	acct2.withdraw2(10.00, 1.50);
	
	System.out.println();
	System.out.println(acct3);
	acct3.withdraw2(5.00, 1.50);
	
	System.out.println();
	System.out.println(acct4);
	acct4.withdraw(0);
	}
}
