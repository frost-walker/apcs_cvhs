import java.util.Scanner;
public class P6B
{
	public static void main(String [] args)
	{
		int num1 = promptForInt();
		int num2 = promptForInt();
		int lcm = 0;
		boolean done = false;
		while(!done)
		{
			lcm++;
			if(isMultiple(lcm, num1) && isMultiple(lcm, num2))
					{
						done = true;
					}
		}
		System.out.println("The lcm is " + lcm);

	}
	public static int promptForInt()
	{
		System.out.println("Enter in a number");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		return num;
	}
	public static boolean isMultiple(int num1,int  num2)
	{
	//	return (num1 % num2) ? true : false; 
		if(num1 % num2 > 0)
			return false;
		return true;
	}


}

