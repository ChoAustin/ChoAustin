//pp 9.3
public class Attributes 
{
	protected String cover;
	protected int pages;
	protected int primChar;
	
	public Attributes(String c, int p, int pc)
	{
		cover = c;
		pages = p;
		primChar = pc;
	}
	
	public String getCover()
	{
		return cover;
	}
	
	public void setCover(String c)
	{
		cover = c;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public void setPages(int p)
	{
		pages = p;
	}
	
	public int getPrimChar()
	{
		return primChar;
	}
	
	public void setPrimChar(int pc)
	{
		primChar = pc;
	}

}
