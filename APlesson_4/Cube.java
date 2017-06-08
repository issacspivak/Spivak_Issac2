import java.util.Scanner;
public class Cube
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of one side:");
		float side = kb.nextFloat();
		float sa = (side*side)*6;
		print(side, sa);
		
	}
	
	public static void print(float one, float two)
	{
		System.out.printf("The surface area of a cube whose sides are %.5f in length is %.5f", one, two);
	}
}