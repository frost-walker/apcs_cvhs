public class SudokuSolver {

  public static void main(String[] args) {
  
  		Puzzle puz = new Puzzle();
				int[][] board = puz.generate();
				
						for (int i = 0; i < 9; i++) {
									for (int j = 0; j < 9; j++) {
													System.out.print(board[i][j]);
													
																}
											}
						
							}
}
