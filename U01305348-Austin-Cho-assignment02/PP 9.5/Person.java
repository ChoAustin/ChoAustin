// pp 9.5
public class Person 
{
	protected String name;
	protected int age;
	protected String dob;
	protected String nat;
	
	public Person(String n, int a, String d, String na)
	{
		name = n;
		age = a;
		dob = d; //date of birth
		nat = na; //nationality
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getDob()
	{
		return dob;
	}
	
	public String getNat()
	{
		return nat;
	}
}
