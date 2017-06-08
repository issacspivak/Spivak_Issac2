import java.util.Scanner;

public class Lab_04_reciept
{
	public static void main(String[]args)
	{
		Lab_04_reciept form = new Lab_04_reciept();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		float price1 = keyboard.nextFloat();
		keyboard.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		float price2 = keyboard.nextFloat();
		keyboard.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		float price3 = keyboard.nextFloat();
		keyboard.nextLine();
		
		float sub = (price1 + price2 + price3);
		float tax = (sub/13);
		float total = (sub + tax);
		
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("                                         ");
		form.format("Subtotal:", sub);
		form.format("Tax:", tax);
		form.format("Total:", total);
		System.out.println("-----------------------------------------");
		System.out.println("* Thank you for your support *");
		
		
		
		
	}
	
	public void format(String item, float price)
	{
		System.out.printf("* %15s ........  %4.2f\n", item,price);
	}
}