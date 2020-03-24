import java.util.Random;
/**
 * @author      : root (root@xander-MS-7B49)
 * @file        : Dice
 * @created     : Saturday Oct 19, 2019 23:06:48 PDT
 */

public class Dice
{
    Random rand = new Random();
	private int face;
	public Dice()
    {
       face = 1; 
    }
	public Dice(int f)
	{
		face = f;
	}
	public int whichFace()
	{
		return this.face;
	}
	public void roll()
	{
		face = rand.nextInt(6) + 1;
	}
}


