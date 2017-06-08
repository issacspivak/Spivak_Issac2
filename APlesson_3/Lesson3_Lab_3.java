import java.util.Scanner;

public class Lesson3_Lab_3
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many sandwiches do you eat a week?");
		float sandwiches = keyboard.nextInt();
		float year = (sandwiches * 52);
		float decade = (year * 10);
		System.out.println("That means you eat " + year + " sandwiches a year");
		System.out.println("And " + decade + " sandwiches in the next decade");
	}
}