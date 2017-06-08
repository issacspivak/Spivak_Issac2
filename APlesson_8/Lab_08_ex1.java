import java.util.Scanner;
public class Lab_08_ex1
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		replace(sentence);
	}
	
	public static void replace(String sentence)
	{
		while(sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1);
		}
		
		System.out.println(sentence);
	}
}