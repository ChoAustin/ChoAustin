import java.util.Random;

public class Account 
{
		Random rand = new Random();
	    private double balance;
	    private String name;
	    private long acctNum;

	  //----------------------------------------------
	  //Constructor -- initializes balance, owner, and account number
	  //----------------------------------------------
	  public Account(double initBal, String owner, long number)
	  {
		  name  = owner;
		  acctNum = number;
		  balance =  initBal;
	  }
	  
	  public Account(double initBal, String owner)
	  {
		  name  = owner;
		  acctNum = rand.nextInt(99999) + 11111;
		  balance =  initBal;
	  }
	  
	  public Account(String owner)
	  {
		  name  = owner;
		  acctNum = rand.nextInt(99999) + 11111;
		  balance =  0;
	  }
	  
	  public Account()
	  {
		  balance = 0;
		  name = " ";
		  acctNum = rand.nextInt(99999) + 11111;
	  }

	  

	  //----------------------------------------------
	  // Checks to see if balance is sufficient for withdrawal.
	  // If so, decrements balance by amount; if not, prints message.
	  //----------------------------------------------
	  public void withdraw2(double amount, double fee)
	  {
		  if (balance >= fee)
			balance -= fee;
		  if (balance >= amount)
		       balance -= amount;
		  else
		       System.out.println("Insufficient funds");
	  }
	  public void withdraw(double amount)
	  {
		
	    if (balance >= amount)
	       balance -= amount;
	    else
	       System.out.println("Insufficient funds");

	  }


	  //----------------------------------------------
	  // Adds deposit amount to balance.
	  //----------------------------------------------
	  public void deposit(double amount)
	  {
	    balance += amount;
	  }

	  //----------------------------------------------
	  // Returns balance.
	  //----------------------------------------------
	  public double getBalance()
	  {
	    return balance;
	  }

	  //----------------------------------------------
	  // Returns account number
	  //----------------------------------------------
	  public double getAcctNumber()
	  {
	    return acctNum;
	  }


	  //----------------------------------------------
	  // Returns a string containing the name, acct number, and balance.
	  //----------------------------------------------
	    public String toString()
	    {
		return "Name: " + name + 
		    "\nAcct #: " + acctNum + 
		    "\nBalance: " + balance;
	    
	}

}
