/**
 * @author      : xander (xander@DESKTOP-Q7ALK0M)
 * @file        : Generator
 * @created     : Sunday Mar 15, 2020 21:39:37 PDT
 */
import java.util.*;
public class Generator1
{
	
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

	public static int[][] completePuzzle(int[][] puzzle)
	{
		int r = 0;
		int[][] cPuzzle = new int[9][9]; //completed puzzle
		int c = 0;
		while(r < puzzle.length)
		{
			Random gen = new Random();
			ArrayList<Integer> gDifficulty = new ArrayList<Integer>();
			// this ArrayList Guarantees difficulty
			for(int n = 0; n < 4; n++)
			{
				int n1 = 0;
				c = gen.nextInt(puzzle[0].length);
				while(n1 < gDifficulty.size() && c != gDifficulty.get(n1))
					n1++;
				if(n1 == gDifficulty.size())
				{
					gDifficulty.add(c);
					cPuzzle[r][c] = puzzle[r][c];
				}
				else
					n--;
			}
			r++;
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
	public static int[][] createPuzzle()
	{
		int[][] puzzle = new int[9][9];
		for(int[] n : puzzle)
			for(int n1 : n)
				n1 = 0;
		generate(puzzle, 0, 0);
		return puzzle;
	}
	public static ArrayList<Integer> generateSelect(int row, int col, int[][] puzzle)
	{
		ArrayList<Integer> select = new ArrayList<Integer>();
		for(int n = 0; n < 10; n++)
			if(checkBox(puzzle, row, col, n)
			   && checkRow(puzzle, row, n)
			   && checkCol(puzzle, col, n))
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
			do
			{
				int n = gen.nextInt(select.size());
				puzzle[row][col] = select.get(n);
				select.remove(n);
				finished = (col == 8) ? 
					generate(puzzle, row + 1, 0) : 
					generate(puzzle, row, col + 1); // this is where the 
													// recursion happens
			}while(select.size() != 0 && !finished);
			if(!finished)
				puzzle[row][col] = 0;
		}
		return finished;
	}
	
	public static void main(String[] args)
	{
		int[][]puzzle = createPuzzle();
		P13A.printArray(puzzle);
		puzzle = completePuzzle(puzzle);
		System.out.println();
		P13A.printArray(puzzle);
	}
}
