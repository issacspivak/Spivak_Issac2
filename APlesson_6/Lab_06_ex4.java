import java.util.Scanner;
public class Lab_06_ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = kb.nextInt();
		System.out.println("Enter the size of the table:");
		int size = kb.nextInt();
		
		format(num, size);
		
	}
	
	public static void format(int num, int size)
	{
		int i = 0;
		for(i = 0; i <= size; i++)
		{
			System.out.printf("\n%10d  |  %7d", i, (i * num));
			
		}
	}
}