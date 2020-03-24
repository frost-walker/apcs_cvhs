/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : ZombieTester
 * @created     : Tuesday Oct 22, 2019 14:24:30 PDT
 */

public class ZombieTester
{
    public ZombieTester()
    {
        
    }
	public static void main (String [] args)
	{
		Zombie darryl = new Zombie();
		for(int x = 1; x < 100; x++)
		{
			darryl.walk();
			System.out.println(darryl);
		}
	}
}


