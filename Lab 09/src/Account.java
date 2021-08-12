public class Account
{
	double balance;
	String name;
	String acctNum;

	public Account(double initBal, String owner, int number)
	{
		initBal = balance;
	}
	// --------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// --------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	// --------------------------------------------
	// Adds deposit amount to balance.
	// --------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}
	// --------------------------------------------
	// Returns balance.
	// --------------------------------------------
	public double getBalance()
	{
		return balance;
	}
	// --------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// --------------------------------------------
	public String toString()
	{
		return balance + " " + name + " " + acctNum;
	}
	// --------------------------------------------
	// Deducts $10 service fee //
	// --------------------------------------------
	public void chargeFee()
	{
		balance -= 10;
	}
	// --------------------------------------------
	// Changes the name on the account
	// --------------------------------------------
	public void changeName(String newName)
	{
		name = newName;
	}
}