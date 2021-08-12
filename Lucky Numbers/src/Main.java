
public class Main {
	public static void main(String[] args) {
		
		int count = 0;

		String num = "108686";
		num = num.replace("0", "");
		num = num.replace("1", "");
		num = num.replace("2", "");
		num = num.replace("3", "");
		num = num.replace("4", "");
		num = num.replace("5", "");
		num = num.replace("7", "");
		num = num.replace("9", "");
		
		
		for (int x = 0; x < num.length() ; x++) {
			if(num.charAt(x)!= ' ')
				count++;
		}
		
		System.out.println("There is " + count + " lucky numbers");
	}
}
