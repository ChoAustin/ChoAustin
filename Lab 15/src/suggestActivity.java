import java.util.Scanner;
public class suggestActivity 
{
	public static void main (String[] args)
	{
		int weather;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's the weather like today?: ");
		weather = scan.nextInt();
		
		if (weather >= 80)
			System.out.println("Swimming");
		if (weather <= 80 && weather >= 60)
			System.out.println("Tennis");
		if (weather <= 60 && weather >=40)
			System.out.println("Golf");
		if(weather < 40)
			System.out.println("Skiing");
	
		
	}
}
