
public class Main {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated (created)
		
		Human human1 = new Human("Austin", 23, 144.6);
		Human human2 = new Human("Austen", 22, 103.4);
		
		System.out.println(human1.name);
		System.out.println();
		System.out.println(human2.name);
		System.out.println();
		human2.eat();
		human1.drink();
		
	}
	
}