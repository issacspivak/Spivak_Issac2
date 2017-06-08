import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		float height = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds?");
		float weight = keyboard.nextInt();
		
		float calc = (weight/(height * height)* 703);
		
		System.out.println("Your bmi is " + calc);
	}
}