/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : P13D1
 * @created     : Saturday Mar 07, 2020 16:57:54 PST
 */

public class P13D1
{
	public static void main(String[] args)
	{
		Object[][] a = new Object[4][6];
		P13A.array(a);
		P13A.printArray(a);
		Object[] b = {'E','F'};
		System.out.println(searchRows(a, b));
	}
	public static boolean searchRow(Object[] a, Object[]b)
	{
		int sIndex = 0, tIndex = 0;
		while(a.length - sIndex >= b.length - tIndex && tIndex < b.length)
		{
			tIndex = 0;
			while(tIndex < b.length && b[tIndex] == a[sIndex + tIndex])
				tIndex++;
			sIndex++;
		}
		return (tIndex == b.length);
	}
	public static boolean searchRows(Object[][] a, Object[]b)
	{
		for(int n = 0; n < a.length; n++)
			if(searchRow(a[n], b))
				return true;
		return false;
	}
}
