import java.util.Scanner;
public class Cube2
{
	static double side;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of one side:");
		side = kb.nextDouble();
		print(side, calcAnswer(side));
		
	}
	public static double calcAnswer(double one)
	{
		return(one*one)*6;
		
	}
	
	public static void print(double one, double two)
	{
		System.out.printf("The surface area of a cube whose sides are %.5f in length is %.5f", one, two);
	}
}