import java.util.Scanner;
public class MphRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Distance: ");
		int distance = keyboard.nextInt();
		
		System.out.println("Hours: ");
		int hours = keyboard.nextInt();
		
		System.out.println("Minutes: ");
		int minutes = keyboard.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPHR() + " mph");
		
		object.setParams(100, 2, 30);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPHR() + " mph");
	}
}