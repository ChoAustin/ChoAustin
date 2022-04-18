
public class Main {
	
	public static void main(String []args) {
		//	method overriding =	declaring a method in sub class,
		//						which is already present in parent class.
		//						done so that a child class can give its own implementation.
		// short explanation: the child class "Dog" can replace the output of a method from its parent class "Animal"
		
		Dog dog = new Dog();
		
		dog.speak();
		
		
	}
}