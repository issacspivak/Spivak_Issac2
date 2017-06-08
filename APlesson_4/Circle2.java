import java.util.Scanner;
public class Circle2
{
	static double r;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		r = kb.nextDouble();
		print(r, calcAnswer(r));
		
	}
	
	public static double calcAnswer(double one)
	{
		return(one*one)*3.14;
		
	}
	
	public static void print(double one, double two)
	{
		System.out.printf("The surface area of a circle whose radius is %.5f in length is %.5f", one, two);
	}
}