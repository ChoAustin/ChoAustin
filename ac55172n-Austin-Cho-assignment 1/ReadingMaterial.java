//pp 9.3
public class ReadingMaterial extends Attributes
{
	private String material;
	
	public ReadingMaterial(String m, String c, int p, int pc)
	{
		super(c, p, pc);
		
		material = m;
		cover = c;
		pages = p;
		primChar = pc;		
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	public void setType(String m)
	{
		material = m;
	}
	
	public String toString()
	{
		return "[Context: " + material + "][Cover: " + cover + "]" +
				"[Pages: " + pages + "][# of Primary Characters: " + primChar + "]";
	}
}
