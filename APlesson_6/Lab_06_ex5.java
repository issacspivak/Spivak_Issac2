import java.util.Scanner;
public class Lab_06_ex5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number to count up to: ");
		int limit = kb.nextInt();
		System.out.println("Please enter a number to count by: ");
		int pattern = kb.nextInt();
		
		
		for(int i = 0; i <= limit; i+= pattern)
		{
			System.out.print(i + "\t");
		}
		
	}
}