public class Lab_09_ex5
{
	
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		fillArray(numbers);
		
	}
	
	public static void fillArray(int [] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		printArray(numbers);
		System.out.println(" ");
		getOdds(numbers);
	}
	
	public static void printArray(int [] numbers)
	{
		System.out.print("For all the following numbers... ");
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
	}
	
	public static void getOdds(int [] numbers)
	{
		System.out.print("The ");
		for(int number : numbers)
		{
			if(number % 2 == 1)
			{
				System.out.print(number + " ");
	
			}
		}
		System.out.print("are odd numbers");
	}
	
}