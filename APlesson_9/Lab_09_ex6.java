public class Lab_09_ex6
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
	}
	
	public static void printArray(int [] numbers)
	{
		System.out.print("For all the following numbers... ");
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println("The biggest number is " + getBiggest(numbers));
	}
	
	public static int getBiggest(int [] numbers)
	{
		int max = 0;
		for(int number : numbers)
		{
			if(number > max)
			{
				max = number;
	
			}
		}
		return max;
	}
	
}