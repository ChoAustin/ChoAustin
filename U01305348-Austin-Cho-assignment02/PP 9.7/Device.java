
public class Device 
{
	protected String product;
	protected String weight;
	protected String price;
	protected String pu; //power usage
	protected String name;
	
	public Device(String prod, String w, String pri, String pow, String n)
	{
		product = prod;
		weight = w;
		price = pri;
		pu = pow;
		name = n;
	}
	
	public String getProduct()
	{
		return product;
	}
	
	public String getWeight()
	{
		return weight;
	}
	
	public void setWeight(String w)
	{
		weight = w;
	}
	
	public String getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
}
