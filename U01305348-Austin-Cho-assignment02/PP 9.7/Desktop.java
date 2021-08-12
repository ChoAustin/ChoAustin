
public class Desktop extends Device
{
	public Desktop(String prod, String w, String pri, String pow, String n)
	{
		super(prod, w, pri, pow, n);
	}
	
	public String toString()
	{
		return product + ", " + weight + ", " + price + ", " + pu + ", " + name;
	}
}
