import java.util.Scanner;
public class Lab_07_ex1
{
	static int num;
	static int sum;
	static int result;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to find the sum of its digits: ");
		num = kb.nextInt();
		sumDigits(num);
	}
	
	public static void sumDigits(int number)
	{
		sum = 0;
		while(number > 0)
		{
			result = sum += number % 10;
			number /= 10;
			
		}
		System.out.println("The sum of the digits in " + num + " is " + result);
	}
}