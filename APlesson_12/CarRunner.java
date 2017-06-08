import java.util.Scanner;
public class CarRunner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Paint: ");
		String p = keyboard.next();
		
		System.out.println("Interior: ");
		String i = keyboard.next();
		
		System.out.println("Engine: ");
		String e = keyboard.next();
		
		System.out.println("Tires: ");
		String t = keyboard.next();
		
		Car car1 = new Car(p, i, e, t);
		
		System.out.println("\nYour vehicle is ready....\nPaint: " + car1.getPaint() + "\nInterior: " + car1.getInterior() + "\nEngine: " + car1.getEngine() + "\nTires: " + car1.getTires());
	}
}