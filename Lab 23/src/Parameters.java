import java.util.Scanner;
public class Parameters
{
	//-----------------------------------------------
	// Calls the average and minimum methods with
	// different numbers of parameters.
	//-----------------------------------------------
	public static void main(String[] args)
	{
		double mean1, mean2, mean3, mean4, mean5;
		mean1 = average(11, 12, 18);
		mean2 = average(11, 12, 18, 75);
		mean3 = average(8);
		mean4 = average();
		mean5 = average(1.5, 3.2, 9.0);
		System.out.println ("mean1 = " + mean1);
		System.out.println ("mean2 = " + mean2);
		System.out.println ("mean3 = " + mean3);
		System.out.println ("mean4 = " + mean4);
		System.out.println ("mean5 = " + mean5);
	}
	//----------------------------------------------
	// Returns the average of its parameters.
	//----------------------------------------------
	public static double average (double...list)
	{
		double result = 0.0;
		if (list.length != 0)
		{
			int sum = 0;
			for ( double num: list)
				sum += num;
			result = (double)sum / list.length;
		}
		return result;
	}
}
