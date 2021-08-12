//pp 9.5
public class JobInformation extends Person
{
	private String occupation;
	private String income;
	private String property;
	
	public JobInformation(String n, int a,String d, String na, String o, String i, String p)
	{
		super(n, a, d, na);
		occupation = o;
		income = i;
		property = p;
	}
	
	public String getOccupation()
	{
		return occupation;
	}
	
	public String getIncome()
	{
		return income;
	}
	
	public void setIncome(String i)
	{
		income = i;
	}
	
	public String getProperty()
	{
		return property;
	}
	
	public String toString()
	{
		return "[Name: " + name + "][Age: " + age + "][D/O/B: " + dob + "][Nationality: " + nat + 
				"][Occupation: " + occupation + "][Income: " + income + "][Property: " + property + "]" ;
				
	}
}
