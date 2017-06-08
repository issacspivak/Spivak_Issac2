import java.util.Scanner;
public class Lab_07_ex4
{
	static String sentence;
	static int num;
	static int i;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence = kb.nextLine();
		replace();
	}
	
	public static void replace()
	{
		
		while (sentence.indexOf("a") >= 0)
		{
			num = sentence.indexOf("a") + 1;
			sentence = (sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(num, sentence.length()));
			
		}
		System.out.println(sentence);
			
	}
}