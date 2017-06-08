import java.util.Scanner;
public class Lesson_09
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 names: ");
		
		//fills the array
		for(int i = 0; i < names.length; i++)
		{
			names[i] = kb.next();
		}
		
		//print the array
		for(String name : names)
		{
			System.out.println("\"" + name + "\", ");
		}
	}
}