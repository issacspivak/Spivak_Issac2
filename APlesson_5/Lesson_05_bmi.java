import java.util.Scanner;
public class Lesson_05_bmi
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		double height = keyboard.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextDouble();
		double calc = (weight/(height * height)* 703);
		String condition = calcCondish(calc);
		System.out.println("Your BMI is: " + calc);
		System.out.println("You are " + condition);
		
	}
	
	public static String calcCondish(double calc)
	{
		if(calc >= 40)
			return "Morbidly Obese";
		else if(calc >= 35)
			return "Very Obese";
		else if(calc >= 30)
			return "Obese";
		else if(calc >= 25)
			return "Overweight";
		else if(calc >= 18.5)
			return "Normal";
		else
			return "Underweight";
	}
}