import java.util.Scanner;
public class Lesson_05_ex6
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		recursion();
	}
	public static void recursion()
	{
		Scanner keyboard = new Scanner(System.in);
		String user = "TPHS1";
		String pass = "password";
		System.out.println("Enter the username: ");
		String attempt = keyboard.next();
		if(attempt.equals(user))
		{
			passCheck(pass);
		}
		else
		{
			System.out.println("Wrong username. Try again");
			recursion();
		}
	}
	public static void passCheck(String pass)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String password = keyboard.next();
		if(password.equals(pass))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			System.out.println("Wrong password. Try again");
			passCheck(pass);
		}
		
	}
}