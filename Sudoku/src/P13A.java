/**
 * @author      : xander (xander@Xanders-MacBook-Air.local)
 * @file        : P13A
 * @created     : Friday Mar 06, 2020 11:30:36 PST
 */

public class P13A
{
	public static void flip(Object[][] a)
	{
		Object[] a1 = new Object[a[0].length];
		for(int n = 0; n < a.length / 2; n++)
		{
			a1 = a[n];
			a[n] = a[a.length - 1 - n];
			a[a.length - 1 - n] = a1;
		}
	}
	public static void reverseArray(Object[][] a)
	{
		Object[] n = new Object[a[0].length];
		for(int x = 0; x < a.length/2; x++)
		{
			n = a[x];
			a[x] = a[a.length - x - 1];
			a[a.length - x - 1] = n;
		}
		
	}
	public static void printArray(int[][] a)
	{
		for(int n = 0; n < a.length; n++)
		{
			for(int n1 = 0; n1 < a[0].length; n1++)
				System.out.print(a[n][n1] + " ");
			System.out.println();
		}
	}
	public static void array(int[][] a)
	{
		char n = (char)65;
		for(int r = 0; r < a.length; r++)
		{
			for(int c = 0; c < a[0].length; c++)
				a[r][c] = n++;
		}
	}

}


