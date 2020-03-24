/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : P13D
 * @created     : Friday Mar 06, 2020 22:29:01 PST
 */

public class P13D
{
	public static boolean searchRow(Object[]search, Object[]target, 
			int n, int n1)
	{
		System.out.print(n);
		System.out.println(" " + n1);
		if(n1 == target.length)
			return true;
		if(search.length - n < target.length - n1)
			return false;
		if(search[n] == target[n1])
			return(searchRow(search, target, n + 1, n1 + 1));
		return(searchRow(search, target, n + 1, 0));
	}
	public static boolean searchRows(Object[][]search, Object[]target, int row)
	{
		if(row == search.length)
			return false;
		if(searchRow(search[row], target, 0, 0))
			return true;
		return searchRows(search, target, row + 1);
	}
	public static void main(String[] args)
	{
		Object[] a = {1, 1, 2, 1, 2, 3};
		Object[][] a1 = new Object[2][3];
		Object[] b = {1, 2, 3};
		System.out.println(searchRow(a, b, 0, 0));
		//if(searchRows(a1, b, 0))
			//System.out.println("Hello");
	}
}


