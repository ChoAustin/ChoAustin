import java.io.*;

import java.util.Scanner;

public class IntegerProcessor 
{
	public static void main(String[] args) throws IOException
	{
		int sum = 0;
		int count = 0;
	Scanner reader = new Scanner(new File("intList.txt"));
	
		while (reader.hasNext())
		{
			int list = reader.nextInt();
			System.out.println(list);
		
			sum = sum + list;
			count++;
		}
			System.out.println("Average: " + (sum/count));
		}
}