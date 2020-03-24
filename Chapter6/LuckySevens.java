/**
 * @author      : root (root@xander-MS-7B49)
 * @file        : LuckySevens
 * @created     : Saturday Oct 19, 2019 23:10:51 PDT
 */
import java.util.Scanner;

public class LuckySevens
{
    public LuckySevens()
    {
        
    }
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int dollars, count, maxDollars, countAtMax;
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		System.out.print("How many dollars do you have? ");
		dollars = reader.nextInt();
		maxDollars = dollars;
		countAtMax = 0;
		count = 0;
		while (dollars > 0)
		{
			count++;
			d2.roll();
			d1.roll();
			if (d2.whichFace() + d1.whichFace() == 7)
			{
				dollars += 4;
			}
			else 
				dollars -= 1;
			if (dollars > maxDollars) {
				maxDollars = dollars;
				countAtMax = count;
			}
	}
	System.out.println("You are broke after " + count + " rolls.\n" + 
							" You should have quit after " + countAtMax + 
							" rolls when you had $" + maxDollars + ".");
	}
}


