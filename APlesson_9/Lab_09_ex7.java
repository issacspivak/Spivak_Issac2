import java.util.Scanner;
public class Lab_09_ex7
{
	
	public static void main(String[]args)
	{
		String [] words = new String[5];
		fillArray(words);
		System.out.println("For all the words " + printArray(words));
		System.out.println("Only " + hasZs(words) + "contain the letter z");
		
	}
	
	public static void fillArray(String [] words)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the five words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		
	}
	
	public static String printArray(String [] words)
	{
		for(String word : words)
		{
			System.out.print(word + " ");
		}
	}
	
	public static String hasZs(String [] words)
	{
		
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				System.out.print(word + ", ");
			}
		}
	
	}
	
}