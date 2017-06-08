import java.util.Scanner;
public class Lab_07_ex3
{
	static int num;
	static int rev;
	static int result;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to find the reversed version: ");
		num = kb.nextInt();
		sumDigits(num);
	}
	
	public static void sumDigits(int number)
	{
		rev = 0;
		while(number > 0)
		{
			rev *= 10;
			result = rev += number % 10;
			number /= 10;
			
		}
		System.out.println(num + " reversed is " + result);
	}
}