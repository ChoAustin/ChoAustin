
public class CellPhone extends Device
{
	public CellPhone(String prod, String w, String pri, String pow, String n)
	{
		super(prod, w, pri, pow, n);
	}
	
	public String toString()
	{
		return product + ", " + weight + ", " + price + ", " + pu + ", " + name;
	}
}
