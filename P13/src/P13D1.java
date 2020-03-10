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
		Object[] b = {'A', 'B', 'C', 'D'};
		System.out.println(searchRows(a, b));
	}
	public static boolean searchRow(Object[] a, Object[]b)
	{
		int n = 0, n1 = 0;
		while(a.length - n1 > b.length - n && n < b.length)
		{
			n = 0;
			while(n < b.length && b[n] == a[n1 + n])
				n++;
			n1++;
		}
		return n == b.length ? true : false;
	}
	public static boolean searchRows(Object[][] a, Object[]b)
	{
		for(int n = 0; n < a.length; n++)
			if(searchRow(a[n], b))
				return true;
		return false;
	}
}
