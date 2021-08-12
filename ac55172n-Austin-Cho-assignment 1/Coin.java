//pp 9.1
public class Coin 
{
	protected final int HEADS = 0;
	protected final int TAILS = 1;
	
	private int face;
	
	public Coin()
	{
		flip();
	}
	
	public void flip()
	{
		face = (int)(Math.random() * 2);
	}
	
	public boolean isHeads()
	{
		return (face ==HEADS);
	}
	
	public String toString()
	{
		String faceName;
		
		if(face ==HEADS)
			faceName = "Heads";
		
		else
			faceName = "Tails";
		return faceName;
	}
}
