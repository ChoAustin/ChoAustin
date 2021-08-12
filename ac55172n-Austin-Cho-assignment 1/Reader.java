//pp 9.3
public class Reader 
{
	public static void main (String[] args)
	{
		ReadingMaterial rm1 = new ReadingMaterial("Manga", "Paper", 120, 6);
		ReadingMaterial rm2 = new ReadingMaterial("Novel", "Hard Cover", 461, 8);
		ReadingMaterial rm3 = new ReadingMaterial("Magazine", "Paper", 364, 12);
		
		System.out.println(rm1);
		System.out.println();
		
		System.out.println(rm2);
		System.out.println();
		
		System.out.println(rm3);
		System.out.println();
	}
}
