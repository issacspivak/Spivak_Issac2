import java.util.Scanner;
public class Lab_07_ex2
{
	static int num;
	static int digits;
	static int average;
	static int result;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to find the average of the digits: ");
		num = kb.nextInt();
		avDigits(num);
	}
	
	public static void avDigits(int number)
	{
		digits = 0;
		while(number > 0)
		{
			digits += 1;
			average += number % 10;
			number /= 10;
			result = average / digits;
			
		}
		System.out.println("The average of the digits in " + num + " is " + result);
	}
}