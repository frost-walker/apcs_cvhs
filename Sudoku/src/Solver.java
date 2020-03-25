import java.util.*;
public class Solver
{
    
    public static int[][] cSolve(int[][] puzzle)
    {
        int[][]cPuzzle = new int[9][9];
        for(int r = 0; r < puzzle.length; r++)
			for(int c = 0; c < puzzle[0].length; c++)
				cPuzzle[r][c] = puzzle[r][c];
		solve(cPuzzle, 0,0);
        return cPuzzle;
    }
    
      
    public static boolean solve(int[][] cPuzzle, int row, int col)
    {
        if(row == 9)
			return true;
		ArrayList<Integer>select = Generator1.generateSelect(row, col, cPuzzle);
        boolean solved = false;
		if(select.size() > 0 && cPuzzle[row][col] == 0)
        {
            while(select.size() > 0 && !solved)
            {
                int n = select.size() - 1;
                cPuzzle[row][col] = select.get(n);
                select.remove(n);
				solved = (col == 8) ?
                    solve(cPuzzle, row + 1, 0) : 
                    solve(cPuzzle, row, col + 1);
            }
            cPuzzle[row][col] = solved ? cPuzzle[row][col] : 0;
        }
        else if(cPuzzle[row][col] != 0)
        {
            if (col == 8)
                return solve(cPuzzle, row + 1, 0);
            else
                return solve(cPuzzle, row, col + 1);
        }
        return solved;
    }

    public static void main(String[] args)
    {
        int[][]puzzle = new int[9][9];
        Generator1.generate(puzzle, 0, 0);
        P13A.printArray(puzzle);
        puzzle = Generator1.completePuzzle(puzzle);
        System.out.println();
        P13A.printArray(puzzle);
        int[][]cPuzzle = cSolve(puzzle);
        System.out.println();
        P13A.printArray(cPuzzle);
    }
}
