/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : GolfDriver
 * @created     : Friday Dec 06, 2019 10:00:20 PST
 */

import java.util.Scanner;

public class GolfDriver
{
    public static void main(String[] args)
    {
        // Create golf data object
        GolfData round1 = new GolfData();

        // Loop to enter golf scores (-1 after last score)
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter scores (-1 when done): ");
        int score = 0;
		score = reader.nextInt();
        while (score >= 0)
        {
            round1.addScore(score);
        	score = reader.nextInt();
		}
        round1.printScores();
		System.out.println(round1.getTotal());
        if(round1.holeInOne())
		{
			System.out.println("YOU GOT A HOLE IN ONE");
		}
		// Modify the addScore() method or the while loop above so that
        // a -1 does not get entered into the scores array.

        // Write a getTotal() method.

        // Write a holeInOne() method that returns the boolean value true
        // if any of the scores in a round was a 1. Otherwise it returns false.

    }
}


