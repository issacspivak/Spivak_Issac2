public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket walkup1 = new Walkup();
		Ticket advance1 = new Advance(15);
		Ticket advance2 = new Advance(5);
		Ticket studentAdvance1 = new StudentAdvance(15);
		Ticket studentAdvance2 = new StudentAdvance(5);
		System.out.println("RECEIPT\n" + walkup1 + "\n" + advance1 + "\n" + advance2 + "\n" + studentAdvance1 + "\n" + studentAdvance2);
		
	}
}