
public class Kennel 
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.setName("Max");
		d1.setAge(4);
		System.out.println(d1);
		System.out.println(d1.name + " is " + d1.getPersonYears() + " years old in human age.");
		
	
		d2.setName("Jenkins");
		d2.setAge(2);
		System.out.println(d2);
		System.out.println(d2.name + " is " + d2.getPersonYears() + " years old in human age.");
		
	}
}
