import java.util.Scanner;

public class Lab_04_idcard
{
	public static void main(String[]args)
	{
		Lab_04_idcard form = new Lab_04_idcard();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String first = keyboard.next();
		
		System.out.println("Please enter your last name:");
		String last = keyboard.next();
		
		System.out.println("Student or teacher?");
		String title = keyboard.next();
		keyboard.nextLine();
		
		System.out.println("Enter which school:");
		String school = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String year = keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();

		
		
		
		System.out.println("************************************");
		form.format(school, year);
		form.format(first, last);
		form.format(title, subject);
		System.out.println("************************************");
		
		
		
		
		
		
	}
	
	public void format(String school, String year)
	{
		System.out.printf("* %13s  %17s * \n", school,year);
	}
}