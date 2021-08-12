
public class Commission extends Hourly
{
	private double totalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double ts)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		totalSales = ts;
		commissionRate = 0;
	}
	public void addComRate(double moreRate)
	{
		commissionRate =+ moreRate;
	}
	
	
	public void setSales(double sales)
	{
		totalSales = sales;
	}
	
	public double pay()
	{
		double payment = super.pay() + (commissionRate * totalSales);
		totalSales = 0;
		return payment;
	}
	
	public String toString()
	{
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone + "\n";
		result += "Total Sales: " + totalSales;
		return result;
	}
}
