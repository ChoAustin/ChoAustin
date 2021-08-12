
public class Purchase 
{
	public static void main(String[] args)
	{
		CellPhone cp = new CellPhone("iPhone", "4.55 ounces", "$200", "Low", "apple");
		Desktop dt = new Desktop("Aurora", "30 pounds", "$699", "High", "AlienWare");
		Laptop lp = new Laptop("All-In-One", "1.8 pounds", "$500", "Mid", "Dell");
		DigitalCamera dc = new DigitalCamera("COOLPIX L830", "1.7 pounds", "$179", "Low", "Nikon");
		
		System.out.println(cp);
		System.out.println();
		
		System.out.println(dt);
		System.out.println();
		
		System.out.println(lp);
		System.out.println();
		
		System.out.println(dc);
		System.out.println();
	}
}
