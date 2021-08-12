
public class Course 
{
	protected String name;
	protected int courseNum;
	protected String description; 
	protected String department; //dyson lubin seidenberg
	
	public Course(String n, int cn, String dp, String ds)
	{
		name = n;
		courseNum = cn;
		description = ds;
		department = dp;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCourseNum()
	{
		return courseNum;
	}
	
	public void setCourseNum(int cn)
	{
		courseNum = cn;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getDepartment()
	{
		return department;
	}
}
