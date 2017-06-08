import java.util.Scanner;

public class Lab_04_intrest
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		Lab_04_intrest form = new Lab_04_intrest();
		
		System.out.println("Please enter the interest rate in percent:");
		double rate1 = keyboard.nextDouble();
		double rate = rate1/100;
		
		System.out.println("Please enter the amount you want to borrow:");
		double principal = keyboard.nextDouble();
		
		System.out.println("Please enter the number of times the loan is compounded per year:");
		double compound = keyboard.nextDouble();
		
		System.out.println("Please enter how many years the loan will be payed off in:");
		double years = keyboard.nextDouble();
		
		double nt = compound*years;
		
	
		
		System.out.print("Your total monthy payment is " + form.calc(rate, principal, compound, years, nt));
		
	}
	
	public double calc(double one, double two, double three, double four, double five)
	{
		return Math.pow(((one/three)+1), five) * two / (four * 12);
	}
	
}