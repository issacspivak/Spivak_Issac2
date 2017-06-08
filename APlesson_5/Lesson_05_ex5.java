import java.util.Scanner;
public class Lesson_05_ex5
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You are sitting at home watching TV, then you get a call from a random number."
		+ "\n Do you answer?" + "\n Answer 1 for yes" + "\n Answer 2 for no");
		int choice1 = keyboard.nextInt();
		
		if(choice1 == 1)
		{
			System.out.println("You answer, all you hear is laughing and gunshots."
			+ "\n Do you stay on the phone?" + "\n Answer 1 for yes" + "\n or 2 for no");
			int choice2 = keyboard.nextInt();
			
			if (choice2 == 1)
			{
				System.out.println("Im coming for you, says the voice."
				+ "\n You run to look outside all the windows but theres nothing there" + "Still wanna stay on the phone?"
				+ "\n Answer 1 for yes" + "\n or 2 for no");
				int choice3 = keyboard.nextInt();
				
				//if (choice3 == 1)
				{
					System.out.println("The voice says... Dont you wish you had a gun for moments like this?"
					+ " Come down to Daves guns and ammo so you never have to feel scared. In complete shock and relief, you hang up the phone and go back to watching TV");
				}
				//else if
				{
					System.out.println("You hang up and go back to watching TV, but your sweating and shaking a bit. Should have never taken the call");
			
				}
			}
			else
			{
				System.out.println("You hang up the phone. But you start to worry about why they called you"
				+ "\n Do you google the number?"
				+ "\n Answer 1 for yes" + "\n or 2 for no");
				int choice4 = keyboard.nextInt();
				
				if (choice4 == 1)
				{
					System.out.println("You look it up and see its a gun store. Then you faint because your so frightened");
				}
				else
					System.out.println("What dont you like about google? everybody loves google");
			}
		}
		else
		{
			System.out.println("You hang up. But it calls again."
			+ "\n Do you just answer to see whats up?" + "\n Answer 1 for yes" + "\n or 2 for no");
			int choice5 = keyboard.nextInt();
			
			if (choice5 == 1)
			{
				System.out.println("You answer, all you hear is laughing and gunshots."
				+ "\n Do you stay on the phone?" + "\n Answer 1 for yes" + "\n or 2 for no");
				int choice6 = keyboard.nextInt();
			
				
				if (choice6 == 1)
				{
					System.out.println("Im coming for you, says the voice."
					+ "\n You run to look outside all the windows but theres nothing there. You hang up in regret you picked up the second time");
				}
					
				else
				{
					System.out.println("You hang up the phone. Maybe you should live a little and find out what was calling you :/");
				}
			}
			else
			{
				System.out.println("Cmon just answer the phone."  + "\n Answer 1 for yes" + "\n or 2 for no");
				int choice7 = keyboard.nextInt();
			
				if (choice7 == 1)
				{
					System.out.println("You pick up the phone and hear: Hiii! are you interested in solar power?" + "\n NO! You respond, like any normal person ");
				}
				else
				{
					System.out.println("Whats even the point of having a phone if you never answer it?");
				}
			}
		}
	}
}