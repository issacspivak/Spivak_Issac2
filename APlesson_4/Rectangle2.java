import java.util.Scanner;
public class Rectangle2
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length:");
		int l = kb.nextInt();
		System.out.println("Enter the width:");
		int w = kb.nextInt();
		print(calcPerim(l, w));
		
	}
	
	public static int calcPerim(int l , int w )
	{
		return((l*2)+(w*2));
	}
	
	public static void print(int perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}