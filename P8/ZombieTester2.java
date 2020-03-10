/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : ZombieTester
 * @created     : Tuesday Oct 22, 2019 14:24:30 PDT
 */
import java.lang.Math;
public class ZombieTester2
{
    public ZombieTester2()
    {
        
    }
	public static int stepsToGetDistance(double distance)
	{
		int steps = 0;
		Zombie pogba = new Zombie(0,0);
		while(pogba.getX() * pogba.getX() + pogba.getY() * pogba.getY() < distance * distance)
		{
			steps++;
			pogba.walk();
		}
		return steps;
	}
	public static double stepsAv(int x, double y)
	{
		int total = 0;
		for (int cont = 0; cont < x; cont++)
		{
			total += stepsToGetDistance(y);
		}
		return (double)(total) / (double)(x);
	}
	public static void main (String [] args)
	{
		Zombie darryl = new Zombie();
		for(int x = 1; x < 100; x++)
		{
			darryl.walk();
		}
		double steps = stepsToGetDistance(45);
		System.out.println(steps);
		steps = stepsAv(1201, 300);
		System.out.println("Average steps to get to distance 99: " + steps);
	}
}


