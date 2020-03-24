/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : GolfData
 * @created     : Friday Dec 06, 2019 09:59:53 PST
 */

public class GolfData
{
    private int[] scores;
    private int numScores;  // the logical size of the array
    // The actual length of the array (scores.length) is the maximum number of
    // elements the array can hold.
    // The logical size is the number of values that have been put into the array so far.

    // Constructor
    public int getTotal()
	{
		int t = 0;
		for(int x = 0; x < numScores; x++)
		{
			t += scores[x];
		}
		return t;
	}
	public GolfData()
    {
        scores = new int[18];
        numScores = 0;
    }
	public boolean holeInOne()
	{
		for(int x = 0; x < numScores; x++)
		{
			if(scores[x] == 1)
				return true;
		}
		return false;
	}
    public void addScore(int scr)
    {
        if (numScores >= 18)
		{
			System.out.println("Too many scores, error");
			return;
		}
		scores[numScores] = scr;
        numScores++;
    }

    public void printScores()
    {
        // When looping through an array that is not full,
        // only go up to the logical size
        for (int i = 0; i < numScores; i++)
        {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
}


