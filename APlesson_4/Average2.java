import java.util.Scanner;
public class Average2
{
	
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
		
		form.print(num1, num2, num3, calcAverage(num1, num2, num3));
		
		
		
	}
	
	public static double calcAverage(double math1, double math2, double math3)
	{
		return(math1+math2+math3)/3;
		
	}
	
	public static void print(double one, double two, double three, double answer)
	{
		System.out.printf("%1s %.5f %1s %.5f %1s %.5f %1s %.5f %1s", "The average of ", one, ",", two, ",", three, "is", answer);
	}
}