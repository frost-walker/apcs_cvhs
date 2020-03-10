/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : P13E
 * @created     : Saturday Mar 07, 2020 12:14:44 PST
 */

public class P13E
{
	public static boolean SearchColumns(Object[][] a, Object[]b)
	{
		Object[][] a1 = P13C.Rotate(a);
		return P13D.searchRows(a1, b, 0);
	}
	public static void main(String[] args)
	{
		Object[][] a = new Object[4][6];
		P13A.array(a);
		Object[][] a1 = P13C.Rotate(a);
		Object[] b = {'A','B', 'C', 'D'};
		System.out.println(SearchColumns(a1, b));
	}
}


