import java.util.Scanner;
public class Rectangle
{
	static int l;
	static int w;
	static int perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length:");
		l = kb.nextInt();
		System.out.println("Enter the width:");
		w = kb.nextInt();
		calcPerim();
		print();
		
	}
	
	public static void calcPerim()
	{
		perimeter = ((l*2)+(w*2));
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}