import java.util.Scanner;
public class Lab_08_ex3
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = kb.nextInt();
		
		System.out.println("The number of 7s is " + luck(number));
		
	} 
	
	public static int luck(int number)
	{
		if(number > 0)
		{
			if(number % 10 == 7)
			{	
				return 1 + luck(number/10);
			}
			
			else 
			{
				return 0 + luck(number/10);
			}
				
		}
		else
		{
			return 0;
		}
		
	}
}	