import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double r = kb.nextDouble();
		double area = (r*r)*3.14;
		print(r, area);
		
	}
	
	public static void print(double one, double two)
	{
		System.out.printf("The surface area of a circle whose radius is %.5f in length is %.5f", one, two);
	}
}