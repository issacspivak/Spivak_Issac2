import java.util.Scanner;
public class Lab_06_ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		
		int factorial = 1;
		for(int i = 1; i <= num; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial for " + num + " is " + factorial);
	}
}