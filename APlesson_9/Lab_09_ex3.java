import java.util.Scanner;
public class Lab_09_ex3
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.print("Numbers...");
		
		for(int num : numbers)
			System.out.print(num + " ");
		
		System.out.println();
		System.out.print("The average of the above numbers is..." + average(numbers));
		
	}
	
	public static int average(int[] n)
	{
		int sum = 0;
		for(int num : n)
		{
			sum += num;
		}
		
		return sum / 10;
		
	}
}