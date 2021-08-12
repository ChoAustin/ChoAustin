
public class Dog 
{
	String name;
	double age, personYears;
	
	public Dog()
	{
		name = null;
		age = 0;
	}
	public String getName(String name)
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public double getAge()
	{
		return age;
	}
	public void setAge(double newAge)
	{
		age = newAge;
	}
	public double getPersonYears()
	{
		personYears = age *7;
		return personYears;
	}
	public String toString()
	{
		return name +" is " + age + " years old.";
	}
}
