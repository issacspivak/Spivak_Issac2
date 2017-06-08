import java.util.Scanner;
public class Lesson_05_gpa
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your letter grade in math?");
		String grade1 = kb.next();
		System.out.println("What is your letter grade in english?");
		String grade2 = kb.next();
		System.out.println("What is your letter grade in science?");
		String grade3 = kb.next();
		System.out.println("What is your letter grade in history?");
		String grade4 = kb.next();
		System.out.println("What is your letter grade in your elective?");
		String grade5 = kb.next();
		System.out.println("What is your letter grade in PE?");
		String grade6 = kb.next();
		System.out.println("What is your letter grade in your 7th class?");
		String grade7 = kb.next();
		
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		double gpa = gPoints/7;
		System.out.printf("Your GPA is %.2f", gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("a"))
			return 4.0;
		if (grade.equals("b"))
			return 3.0;
		if (grade.equals("c"))
			return 2.0;
		if (grade.equals("d"))
			return 1.0;
		else
			return 0.0;
	}
}