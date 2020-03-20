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
		ArrayList<Integer> avail = new ArrayList<Integer>();
		int penis = 0;
		generate(puzzle, 0, 0, avail, penis);
		return puzzle;
	}
	public static ArrayList<Integer> generateSelect(ArrayList<Integer> avail,
			int row, int col, int[][] puzzle)
	{
		ArrayList<Integer> select = new ArrayList<Integer>();
		int n1 = 0;
		for(int n = 0; n < 10; n++)
		{
			if(checkBox(puzzle, row, col, n)
					&& checkRow(puzzle, row, n)
					&& checkCol(puzzle, col, n))
			{
				while(n1 < avail.size() && n != avail.get(n1))
					n1++;
				if(n1 == avail.size())
					select.add(n);
				n1 = 0;
			}
		}
		return select;
	}
	public static void generate(int[][] puzzle, int row, int col,
			ArrayList<Integer> avail, int penis)
	{
		System.out.println(penis++);
		P13A.printArray(puzzle);
		if(row == 9)
			return;
		Random gen = new Random();
		if(col == 0 && avail.size() >= 9)
			avail = new ArrayList<Integer>();
		ArrayList<Integer> select = generateSelect(avail, row, col, puzzle);
		if(select.size() == 0)
			prevSquare(puzzle, row, col, avail, penis);
		else
		{
			int n = gen.nextInt(select.size());
			puzzle[row][col] = select.get(n);
			avail.add(select.get(n));
			nextSquare(puzzle, row, col, avail, penis);
	
		}
	}
	// helper function that moves to the next square
	public static void nextSquare(int[][] puzzle, int row, int col,
			ArrayList<Integer> avail, int penis)
	{
		if(col == 8)
			generate(puzzle, row + 1, 0, avail, penis);
		else
			generate(puzzle, row, col + 1, avail, penis);
	}
	// helper function that goes back a square
	public static void prevSquare(int[][] puzzle, int row, int col,
			ArrayList<Integer> avail, int penis)
	{
		if(avail.size() > 0)
			avail.remove(avail.size() - 1);
		if(col == 0)
		{
			row--;
			col = 8;
		}
		else
			col--;
		avail.add(puzzle[row][col]);
		puzzle[row][col] = 0;
		generate(puzzle, row, col, avail, penis);
	}
	public static void main(String[] args)
	{
		int[][]puzzle = createPuzzle();
		P13A.printArray(puzzle);
	}


}


