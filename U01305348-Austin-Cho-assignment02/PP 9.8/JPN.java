
public class JPN extends Course
{
	public JPN(String n, int cn, String dp, String ds)
	{
		super(n, cn, dp, ds);
	}
	
	public String toString()
	{
		return name + ", " + courseNum + ", " + department + ", " + description;
	}
}
