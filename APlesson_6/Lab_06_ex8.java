public class Lab_06_ex8
{
	public static void main(String[]args)
	{
		String na = "Na";
		String hey = "Hey";
		String bye = "Goodbye!";
		sing(na, 4);
		sing(na, 4);
		sing(hey, 3);
		sing(bye, 1);
	}
	
	public static void sing(String one, int repeat)
	{
		for(int i = 0; i < repeat; i++)
		{
			System.out.print(one + "\t");
		}
		System.out.println("\n");
	}
}