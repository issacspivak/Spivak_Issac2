public class Lesson_05_ex1
{

	public static void main(String[]args)
	{
		int player = (int)(Math.random()*8);
		int computer = (int)(Math.random()*8);
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		
		boolean winner = player > computer;
		diceRoll(winner);
		
		
	}
	
	public static void diceRoll(boolean win)
	{
		
		if (win)
			System.out.println("And the winner is you!");
		if(!win)
			System.out.println("And the winner is the computer");
	}
	
	
}