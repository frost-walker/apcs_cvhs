/**
 * @author      : xander (xander@DESKTOP-Q7ALK0M)
 * @file        : Generator
 * @created     : Sunday Mar 15, 2020 21:39:37 PDT
 */
// the second of two: this time it's truly backtracking
 import java.util.*;
public class Generator1
{
	public static boolean checkAcross(int[][] puzzle, int row, int col,
			int checkFor)
	{
		int c = 0, r = 0;
		while(c < puzzle[0].length && puzzle[row][c] != checkFor)
			c++;
		while(r < puzzle.length && puzzle[r][col] != checkFor)
			r++;
		return(c == puzzle[0].length && r == puzzle.length);
	}
	public static int[][] completePuzzle(int[][] puzzle)
	{
		int[][] cPuzzle = new int[9][9]; //completed puzzle
		ArrayList<Integer[]> gDifficulty = new ArrayList<Integer[]>();
		while(gDifficulty.size() != 36)
		{
			Random gen = new Random();
			int row = gen.nextInt(puzzle.length);
			int col = gen.nextInt(puzzle[0].length);
			int n = 0;
			while(n < gDifficulty.size() 
					&& !(gDifficulty.get(n)[0] == row
					&& gDifficulty.get(n)[1] == col))
			n++;
			if(n == gDifficulty.size())
			{
					gDifficulty.add(new Integer[]{row, col});
					cPuzzle[row][col] = puzzle[row][col];
			}
		}
		return cPuzzle;
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

	public static ArrayList<Integer> generateSelect(int row, int col, 
			int[][] puzzle)
	{
		ArrayList<Integer> select = new ArrayList<Integer>();
		for(int n = 0; n < 10; n++)
			if(checkBox(puzzle, row, col, n)
			   && checkAcross(puzzle, row, col, n))
				select.add(n);
		return select;
	}
	public static boolean generate(int[][] puzzle, int row, int col)
	{
		boolean finished = false;
		if(row == 9)
			return true;
		Random gen = new Random();
		ArrayList<Integer> select = generateSelect(row, col, puzzle);
		if(select.size() > 0)
		{	
			while(select.size() > 0 && !finished)
			{
				int n = gen.nextInt(select.size());
				puzzle[row][col] = select.get(n);
				select.remove(n);
				finished = (col == 8) ? 
					generate(puzzle, row + 1, 0) : 
					generate(puzzle, row, col + 1); // this is where the 
													// recursion happens
			}
			puzzle[row][col] = finished ? puzzle[row][col] : 0;	
		}
		return finished;
	}
	
	public static void main(String[] args)
	{
		int[][]puzzle = new int[9][9];
		generate(puzzle, 0, 0);
		P13A.printArray(puzzle);
		puzzle = completePuzzle(puzzle);
		System.out.println();
		P13A.printArray(puzzle);
	}
}
