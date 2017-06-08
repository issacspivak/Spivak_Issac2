public abstract class Ticket
{
	int serialNo;
	
	public Ticket()
	{
		serialNo = (int)(Math.random()*9000000)+1000000;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + serialNo + "\nPrice: $" + getPrice();
	}
}