import java.util.Scanner;

public class Lab_04_subwoofer
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Lab_04_subwoofer form = new Lab_04_subwoofer();
		
		System.out.println("Enter height in inches:");
		double height = keyboard.nextFloat();
		
		System.out.println("Enter length in inches:");
		double length = keyboard.nextFloat();
		
		System.out.println("Enter width in inches:");
		double width = keyboard.nextFloat();
		double volume = (height*length*width);
		
		System.out.println("The volume of the subwoofer is " + volume + "cubic inches. And " + form.calcVol(height, length, width) + " cubic feet");
	}
	
	public double calcVol(double one, double two, double three)
	{
		return ((one*two*three)/1728);
	}
	
	
}