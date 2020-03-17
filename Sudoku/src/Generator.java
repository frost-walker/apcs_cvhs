/**
 * @author      : xander (xander@DESKTOP-Q7ALK0M)
 * @file        : Generator
 * @created     : Sunday Mar 15, 2020 21:39:37 PDT
 */
import java.util.*;
public class Generator
{
	// a generator that is pseudo-recursive, using backtracking
	// could not comprehend this so the solution is unoriginal
	
	public static boolean checkRow(int[][] puzzle, int row, int checkFor)
	{
		int c = 0;
		while(c < puzzle[0].length && puzzle[row][c] != checkFor)
			c++;
		return(c == puzzle[0].length);
	}

	public static boolean checkCol(int[][] puzzle, int col, int checkFor)
	{
		int r = 0;
		while(r < puzzle.length && puzzle[r][col] != checkFor)
			r++;
		return(r == puzzle.length);
	}

	public static boolean checkBox(int[][] puzzle, int row, 
			int col, int checkFor)
	{
		int boxRow = row / 3 * 3;
		int boxCol = col / 3 * 3;
		while(boxRow < row / 3 * 3 + 3 && puzzle[boxRow][boxCol] != checkFor)
		{
			boxCol++;
			if(boxCol == col / 3 * 3 + 3)
			{
				boxCol -=3;
				boxRow++;
			}
		}
		return (boxRow == row / 3 * 3 + 3 );
	}
	public static int[][] createPuzzle()
	{
		int[][] puzzle = new int[9][9];
		for(int[] n : puzzle)
			for(int n1 : n)
				n1 = 0;
		generate(puzzle, 0, 0);
		return puzzle;
	}
	public static void generate(int[][] puzzle, int row, int col)
	{
		P13A.printArray(puzzle);
		if(row == 9)
			return;
		boolean foundNum = false;
		Random gen = new Random();
		ArrayList<Integer> selection = new ArrayList<Integer>();
		// I at least came up with this, the process was terrible
		for(int i = 1; i < 10; i++)
			selection.add(i);
		while(!selection.isEmpty() || !foundNum)
		{
			int addTo = gen.nextInt(selection.size());
			if(checkBox(puzzle, row, col, selection.get(addTo))
					&& checkRow(puzzle, row, selection.get(addTo))
					&& checkCol(puzzle, col, selection.get(addTo)))
			{
				puzzle[row][col] = selection.get(addTo);
				foundNum = true;
				break;
			}
			else
			{
				selection.remove(addTo);
				if(selection.isEmpty())
					break;
			}
		}
		if(selection.isEmpty())
			prevSquare(puzzle, row, col);
		else if(foundNum && emptyCheck(puzzle))
			nextSquare(puzzle, row, col);

	}
	// helper function that moves to the next square
	public static void nextSquare(int[][] puzzle, int row, int col)
	{
		if(col == 8)
			generate(puzzle, row + 1, 0);
		else
			generate(puzzle, row, col + 1);
	}
	// helper function that goes back a square
	public static void prevSquare(int[][] puzzle, int row, int col)
	{
		if(col == 0)
		{
			row--;
			col = 8;
		}
		else
			col--;
		generate(puzzle, row, col);
	}
	public static void main(String[] args)
	{
		int[][]puzzle = createPuzzle();
	}
	public static boolean emptyCheck(int[][]puzzle)
	{
		for(int[]n : puzzle)
			for(int n1 : n)
				if(n1 == 0)
					return true;
		return false;
	}

}


