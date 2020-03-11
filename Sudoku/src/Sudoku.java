/**
 * @author      : xander (xander@DESKTOP-Q7ALK0M)
 * @file        : Sudoku
 * @created     : Tuesday Mar 10, 2020 16:11:20 PDT
 */

public class Sudoku
{
	public static boolean checkBox(int[][]box, int r, int c, int checkFor)
	{
		if(box[r][c] == checkFor)
			return false;	
		c++;
		if(c == box.length)
		{
			c = 0;
			r++;
		}
		if(r == box.length)
			return true;	
		return(checkBox(box, r, c, checkFor));
		
	}
	
	public static boolean checkRows(int[][]a, int row, int column, int checkFor)
	{
		int r = 0, c = 0;
		while(c < column && a[row][c] != checkFor)
			c++;
		while(r < row && a[r][column] != checkFor)
			r++;
		return (r == row && c == column);
	}
	public static boolean checkRow(int []a, int checkFor)
	{
		int n = 0;
		while(n < a.length && a[n] != checkFor)
			n++;
		return (n == a.length);
	}
	public static int[][][] generate()
	{
		int[][][] boxForm = new int[9][3][3]; // Need these two of these 
		int[][] rowForm = new int[9][9];
		int boxNum = 0; // I'm a noob So I gotta do this
		int r = 0, c = 0, r1 = 0, c1 = 0, c2 = 0; // Two row column lists
		for(int n = 0; n < 81; n++)
		{
			int z = (int)(Math.random() * 9) + 1;
			while(!(checkBox(boxForm[r1], 0, 0, z)))
			{
				z = (int)(Math.random() * 9) + 1;
				System.out.print(r);
				System.out.print(c);
				System.out.print(r1);
				System.out.print(c1);
				System.out.println(c2);
				/*System.out.println(z);
				System.out.println("Row" + checkRows(rowForm, r, c, z));
				System.out.println(checkBox (boxForm[r1], 0, 0, z));
			*/}
			boxForm[r1][c1][c2] = z;
			rowForm[r][c] = z;
			 // incrementing section, don't mind here
			c2++;
			c++;
			if(c2 == 3)
			{
				c1++;
				c2 = 0;
				if(c1 == 3)
				{
					c1 = 0;
					r1++;
					r++;
					c -= 3 * (r1 + 1);
					if((r1 + 1) % 3 == 0)
						c = 0;
					else
						r -= 3;
				}

			}
		}
		P13A.printArray(rowForm);
		return boxForm;
	}
	public static void main(String[] args)
	{
		int[][][] a = generate();
		for(int n = 0; n < a.length; n++)
		{
			for(int n1 = 0; n1 < a[0].length; n1++)
			{
				for(int n2 = 0; n2 < a[0][0].length; n2++)
					System.out.print(a[n][n1][n2]);
			}
			System.out.println();
		}
	}
}


