
public class Door 
{
private String state;
private String name;

	public Door()
	{
		state = "closed";
		name = "Back Door";
	}
	public String getName()
	{
		return name;
	}
	public String getState()
	{
		return state;
	}
	public void setName(String newName)
	{
		name = newName; 
	}
	public void setState(String newState)
	{
		state = newState;
	}
	public void open()
	{
		return;
	}
	public void close()
	{
		return;
	}
	public String toString()
	{
		return state + name;
	}
}