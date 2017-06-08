import java.util.Scanner;
public class Lab_08_ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		int stop = word.length();
		int start = 0;
		tree(word, start, stop);
		
	}
	
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%8s", word.substring(0, start));
			System.out.println();
			start++;
			tree(word, start, stop);
		}
		
	}
}