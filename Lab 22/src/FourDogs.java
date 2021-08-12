

public class FourDogs 
{
	public static void main (String[] args)
	{
		Dog[] Dogs = 
			{
				new Dog("Lily", 5), 
				new Dog("Jacob", 2), 
				new Dog("Sugar", 8), 
				new Dog("Bush", 3)
			};
			
		for(Dog list : Dogs)
		{
			System.out.println(list);
		}
	}
}
