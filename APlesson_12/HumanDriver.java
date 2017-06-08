import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hair: ");
		String h = keyboard.next();
		
		System.out.println("Eyes: ");
		String e = keyboard.next();
		
		System.out.println("Skin: ");
		String s = keyboard.next();
		
		Human object = new Human(h, e, s);
		
		System.out.println("\nMy info...\nHair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
		
		object.setHES("black", "green", "dark");
		
		System.out.println("\nFriends info...\nHair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	}
}