//pp 9.2
public class Employee 
{
	private String job;
	private String skill;
	
	public Employee(String j, String s)
	{
		job = j;
		skill = s;
	}
	
	public String getJob()
	{
		return job;
	}
	
	public String getSkill()
	{
		return skill;
	}
	
	public String toString()
	{
		return "[Job: " + job + "][Skill: " + skill + "]";
	}
}
