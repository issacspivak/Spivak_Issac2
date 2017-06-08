public class Lab_11_ex3
{
	public static void main (String[]args)
	{
		String[][] xAndO = new String[4][4];
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				int pick = (int)(Math.random()*2 + 1);
				if(pick == 1)
				{
					xAndO[i][j] = "x";
				}
				else
				{
					xAndO[i][j] = "o";
				}
				
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
	}
}