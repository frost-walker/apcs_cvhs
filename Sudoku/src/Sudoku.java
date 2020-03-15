/**
 * @author      : xander (xander@DESKTOP-Q7ALK0M)
 * @file        : Sudoku
 * @created     : Tuesday Mar 10, 2020 16:11:20 PDT
 */

public class Sudoku
{
	
	public static boolean checkBox(int[][]box, 
			int boxRow, int boxCol, int checkFor)
	{
		// boxRow and boxCol say which box it is checking
		// Loop through the box, look for the number checkFor
		int row = 0;
		int col = 0;
		row = (boxRow + 1) * 3;
		col = (boxCol + 1) * 3;
		int r = boxRow * 3;
		int c = boxCol * 3;// Iteration variables 
		while(r < row && box[r][c] != checkFor)
		{
			c++;
			if(c == col)
			{
				c -= 3;
				r++;
			}
		}
		return (r == row);
	}
	/*public static boolean checkBox(int[][]box, int r, int c, int checkFor)
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
		
	}*/
	
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
	public static int[][] generate()
	{
		int[][] puzzle = new int[9][9];
		int col = 0; // Row, column, boxCol ( 0 to 3), boxRow( zero to three)
		int row = 0;
		int boxCol = 0;
		int boxRow = 0;
		long z = 0;
		int insert = (int)(Math.random() * 9) + 1; // number to insert
		while(boxRow < 3)
		{	
			while(!((checkBox(puzzle, boxRow, boxCol, insert))))
			{
				System.out.println(checkBox(puzzle, boxRow, boxCol, insert));
				insert = (int)(Math.random() * 9) + 1;
			}
			if(z > 100000)
			{
				System.out.print(row);
				System.out.print(col);
				System.out.print(boxRow);
				System.out.println(boxCol);
				return puzzle;
			}
			puzzle[row][col] = insert;
			// chunk of clunky movement code that ensures box by box editing
			col++;
			if(col % 3 == 0)
			{
				row++;
				if(row % 3 == 0)
				{
					boxCol++;
					if(boxCol == 3)
					{
						boxCol = 0;
						col = 0;
						boxRow++;
					}
					else row -= 3;
				}
				else col -= 3; // Goes down three rows by three rows every time
						   // From right to left by each box
			}
		}
		return puzzle;
	}
	public static void main(String[] args)
	{
		int[][] a = generate();	
		P13A.printArray(a);
	}
}


