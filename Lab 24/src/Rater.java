
public class Rater
{
	
	public static void main(String[]args)
	{
		System.out.println("\t"+"\t"+"Rating of 5 movies");
		System.out.println("\t"+"movie1 movie2 movie3 movie4 movie5");
		
		int[][]table = new int[10][5];
		
		for (int row = 0; row < table.length; row++)
			for (int col = 0; col < table[row].length; col++)
				table[row][col] = 2;
		
		for(int row = 0; row < table.length; row++)
		{
			for(int col = 0; col < table[row].length; col++)
				System.out.print("\t" + table[row][col]);
			
			System.out.println();
		}
	}
}
