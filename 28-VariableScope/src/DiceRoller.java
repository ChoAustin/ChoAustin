import java.util.Random;

public class DiceRoller {

	// Random random = new Random();
	// int number = 0;
	// by putting these variables outside the two methods, they all are considered global values that can be accessed.
	// currently down below, all the variables are local due to them being within their own respective methods. 
	
	DiceRoller(){
		Random random = new Random();
		int number = 0;
		roll(random, number);
		
	}
	
	void roll(Random random, int number) {
		
		number = random.nextInt(6)+1;
		System.out.println(number);
		
	}
	
}
