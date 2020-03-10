/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : P13B
 * @created     : Friday Mar 06, 2020 20:14:39 PST
 */

public class P13B
{
	public static Object[] reverseArray(Object[] a)
	{
		Object[] z = new Object[a.length];
		for(int n = 0; n < z.length; n++)
			z[z.length - 1 - n] = a[n];
		return z;
	}
	public static void Snake(Object[][] a)
	{
		for(int n = 1; n < a.length; n += 2)
			a[n] = reverseArray(a[n]);
	}
	public static void main(String[] args)   
	{
		Object[][] a = new Object[4][6];
		P13A.array(a);	
		P13A.printArray(a);
		Snake(a);
		P13A.printArray(a);
	}
}


