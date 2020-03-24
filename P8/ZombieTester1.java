/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : ZombieTester
 * @created     : Tuesday Oct 22, 2019 14:24:30 PDT
 */

public class ZombieTester1
{
    public ZombieTester1()
    {
        
    }
	public static void main (String [] args)
	{
		Zombie darryl = new Zombie(50,150);
		/*for(int x = 1; x < 100; x++)
		{
			darryl.walk();
			System.out.println(darryl);
		}*/
		System.out.println(darryl.toString());
	}
}


