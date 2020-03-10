import java.util.Scanner;
public class Temp
{
	public static int promptForInt()
	{
		System.out.println("Enter an integer: ");
		Scanner reader = new Scanner(System.in);
		int bob = reader.nextInt();
		return bob;
	};
	public static boolean isMultiple(int x, int y)
	{
		if((x % y) > 0)
			return false;
		return true;
	};
	public static void main(String[] args)
	{
		int num1 = promptForInt();
		int num2 = promptForInt();
		int cm1 = 0;
		boolean done = false;
		while(!done)
		{
			cm1++;
			if(isMultiple(cm1,num1) && isMultiple(cm1, num2))
			{
				done = true;
			}

		}
		System.out.println("The least common multiple is " + cm1);
	}
}
