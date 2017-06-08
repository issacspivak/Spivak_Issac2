import java.util.Scanner;

public class Lesson_05_ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first item: ");
		String item1 = kb.next();
		System.out.println("Enter the price of the first item: ");
		double price1 = kb.nextDouble();
		System.out.println("Enter the second item: ");
		String item2 = kb.next();
		System.out.println("Enter the price of the second item: ");
		double price2 = kb.nextDouble();
		System.out.println("Enter the third item: ");
		String item3 = kb.next();
		System.out.println("Enter the price of the third item: ");
		double price3 = kb.nextDouble();
		System.out.println("Enter the fourth item: ");
		String item4 = kb.next();
		System.out.println("Enter the price of the fourth item: ");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		System.out.println(discount(subtotal));
		
		
	}
	
	public static String discount(double total)
	{
		double subtract = total*0.15;
		boolean bargain = total > 2000;
		
		if(bargain)
			return "The discount is 15 percent, which is a discount of " + subtract;
		else
			return "The discount is 0 percent";
			
		
	}
}