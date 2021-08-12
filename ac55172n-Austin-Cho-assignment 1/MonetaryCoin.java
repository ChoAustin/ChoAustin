//pp 9.1
public class MonetaryCoin extends Coin
{
	private int value;
	
	public MonetaryCoin(int v)
	{
		value = v;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public int getValue()
	{
		return value;
	}
}
