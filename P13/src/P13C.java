/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : P13C
 * @created     : Friday Mar 06, 2020 21:41:44 PST
 */

public class P13C
{
	public static Object[][] Rotate(Object[][] a)
	{
		P13A.flip(a);
		Object[][] n = new Object[a[0].length][a.length];
		Object[] n1 = new Object[n[0].length];
		for(int c = 0; c < a[0].length; c++)
		{
			for(int r = 0; r < a.length; r++)
			{
				n[c][r] = a[r][c]; 
			}
		}
		return n;
	}

	public static void main(String[] args)
	{
		Object[][] a = new Object[4][6];
		P13A.array(a);
		P13A.printArray(a);
		Object[][] b = Rotate(a);
		P13A.printArray(b);
	}
}


