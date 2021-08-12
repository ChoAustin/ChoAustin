public class ManageAccounts
{
	public static void main(String[] args)
	{
		Account acct1, acct2;
		//create account1 for Sally with $1000
		acct1 = new Account(1000, "Sally", 1111);
		acct1.acctNum = "1111";
		acct1.balance = 1000;
		acct1.name = "Sally";
		System.out.println(acct1);
		
		
		
		//create account2 for Joe with $500
		acct2 = new Account(500,"Joe",1112);
		acct2.acctNum = "1112";
		acct2.balance = 500;
		acct2.name = "Joe";
		System.out.println(acct2);
		
		
		//deposit $100 to Joe's account by calling certain method
		acct2.deposit(100);
		
		//print Joe's new balance (use getBalance())
		System.out.println();
		System.out.println("Joe deposited $100, his new balance is $" + acct2.getBalance());
		System.out.println();
		
		acct1.withdraw(50);
		
		System.out.println("Sally withdrawed $50, her new balance is $" + acct1.getBalance());
		System.out.println();
		acct1.chargeFee();
		acct2.chargeFee();
		
		acct2.changeName("Joseph"); //your code here: change the name on Joe's account to Joseph
		System.out.println("After charge fees were applied, these are the two current balance");
		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
	}
}