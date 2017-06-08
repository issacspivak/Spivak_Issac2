import java.util.Scanner;
public class Average
{
	
	static double num1;
	static double num2;
	static double num3;
	static double solution;
	
	public static void main(String[]args)
	{
		
		Average form = new Average();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		double num1 = kb.nextFloat();
		
		System.out.println("Enter your second number:");
		double num2 = kb.nextFloat();
		
		System.out.println("Enter your third number:");
		double num3 = kb.nextFloat();
		
		calcAverage(num1, num2, num3);
		form.print(num1, num2, num3, solution);
		
		
		
		
	}
	
	public static void calcAverage(double math1, double math2, double math3)
	{
		solution = (math1+math2+math3)/3;
		
	}
	
	public static void print(double one, double two, double three, double answer)
	{
		System.out.printf("The average of %.5f , %.5f , %.5f is %.5f", one, two, three, answer);
	}
}