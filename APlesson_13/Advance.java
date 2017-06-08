public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance(int dl)
	{
		super();
		daysLeft = dl;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
			return 30;
		else
			return 40;
	}
}