import java.util.Scanner;

public class RudeAI
{
	public static void main(String [] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + "?? HAHAHAHAHA!! Such an ugly name lol");
		
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println(age + "?? That sucks");
		
		System.out.println("What do you do for fun?");
		String fun = keyboard.nextLine();
		System.out.println("Wow... You " + fun + ". only losers like to do that");
		
		System.out.println("What What kind of music do you like?");
		String music = keyboard.nextLine();
		System.out.println("U have got to be kidding me... I hate " + music);
		
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		int rude = 1;
		System.out.println("So i guess that means you rank at " + (siblings + rude) + " for the siblings your parents love most");
		
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.nextLine();
		System.out.println(job + "?? You need to rethink your life dude...");
		
	}
}