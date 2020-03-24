/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : Test
 * @created     : Tuesday Mar 10, 2020 22:25:23 PDT
 */

public class Test
{
    public static void main(String[] args)
    {
		int[][]a = new int[9][9];
		int[][][]a1 = new int[9][3][3];
		int n = 0;
		for(int x = 0; x < a.length; x++)
		{
			for(int x1 = 0; x1 < a[0].length; x1++)
			{	a[x][x1] = n++;
		
				System.out.print(a[x][x1]);
			}
			System.out.println();
		}
		n = 0;
		for(int x = 0; x < a1.length; x++)
		{
			for(int x1 = 0; x1 < a1[0].length; x1++)
			{
				for(int x2 = 0; x2 < a1[0][0].length; x2++)
				{a1[x][x1][x2] = n++;
					System.out.print(a1[x][x1][x2]);}
				System.out.println();
			}
		}
    }
}


