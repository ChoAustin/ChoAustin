import java.util.*;
public class InitilizarList 
{
	public static void main (String []args)
	{
		int[] primes = {1,2,3,5,7};
		
		int[] numbers = new int[5];
		System.out.println("The arraylist size is " + numbers.length);
		{
			for (int prime : primes)
				 System.out.print(prime + " ");
					System.out.println();
			
		}
			primes[0] = 1;
			primes[1] = 2;
			primes[2] = 3;
			primes[3] = 5;
			primes[4] = 7;
			{
			for (int prime : primes)
				System.out.println(prime + " ");
			}
	}
}
