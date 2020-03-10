/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : Zombie
 * @created     : Tuesday Oct 22, 2019 14:04:25 PDT
 */
import java.lang.Math;
public class Zombie
{
    private int x, y;

	public Zombie()
    {
    	x = 100;
		y = 100;
    }
	public Zombie(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void walk()
	{
		int steps = (int)(Math.random() * 7) - 3;
		x += steps;
		steps = (int)(Math.random() * 7) - 3;
		y += steps;
	}
	public String toString()
	{
		return String.valueOf(x) + " " + String.valueOf(y);
	}
	public void walkToward(int x, int y)
	{
		int yFactor;
		int xFactor;
		xFactor = x - this.x < 0 ? -1 : 1;
		yFactor = y - this.y < 0 ? -1 : 1;
		int direction = (int)(Math.random() * 2);
		int steps = (int)(Math.random() * 7) - 3 + xFactor;
		this.x += steps;
		steps = (int)(Math.random() * 7) - 3 + yFactor;
		this.y += steps;
	}
	
}


