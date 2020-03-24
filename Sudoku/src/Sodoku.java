
public class Sodoku
{
   public int[][] grid;

   public Sodoku()
   {
       grid = new int[9][9];
   }

   public void generate()
   {
       for (int row = 0; row < 9; row++)
       {
           for (int col = 0; col < 9; col++)
           {
               boolean legal = false;
               while (!legal)
               {
                   grid[row][col] = (int) (Math.random() * 9) + 1;
                   int[] sees = new int[27];
                   for (int i = 0; i < 9; i++)
                   {
                       sees[i] = grid[row][i];
                   }
                   for (int i = 9; i < 18; i++)
                   {
                       sees[i] = grid[i - 9][col];
                   }
                   int f = 0;
                   int m = 18;
                   for (int j = 0; j < 9; j += 3)
                   {
                       for (int x = 0; x < 9; x += 3)
                       {
                           if (row >= j && row < j + 3 && col >= x && col < x + 3)
                           {
                               for (int r = j; r < j + 3; r++)
                               {
                                   for (int c = x; c < x + 3; c++)
                                   {
                                       sees[m] = grid[r][c];
                                       if (r == row && c == col)
                                       {
                                           f = m;
                                       }
                                       m++;
                                   }
                               }
                           }
                       }
                   }
                   sees[col] = 0;
                   sees[row + 9] = 0;
                   sees[f] = 0;
                   for (int i = 0; i < 27; i++)
                   {
                       if (sees[i] == grid[row][col])
                       {
                           break;
                       }
                       if (i == 26)
                       {
                           legal = true;
                       }
                   }
                   if (isFull(sees))
                   {
                       grid = new int[9][9];
                       row = 0;
                       col = 0;
                   }
               }
           }
       }
       for (int row = 0; row < 9; row++)
       {
           for (int col = 0; col < 9; col++)
           {
               double d = Math.random();
               if (d < .5)
               {
                   grid[row][col] = 0;
               }
           }
       }
       for (int row = 0; row < grid.length; row++)
       {
           for (int col = 0; col < grid[0].length; col++)
           {
               System.out.print(grid[row][col] + "  ");
           }
           System.out.println();
       }
   }

   public boolean isFull(int[] array)
   {
       boolean full = true;
       int[] frequency = new int[9];
       for (int i = 0; i < array.length; i++)
       {
           if (array[i] != 0)
           {
               frequency[array[i] - 1]++;
           }
       }
       for (int i = 0; i < 9; i++)
       {
           if (frequency[i] == 0)
           {
               full = false;
           }
       }
       return full;
   }

   public void solve(int[][] grid_)
   {
       int[] rows;
       int[] cols;
       int l = 0;
       for (int row = 0; row < 9; row++)
       {
           for (int col = 0; col < 9; col++)
           {
               if (grid_[row][col] != 0)
               {
                   l++;
               }
           }
       }
       rows = new int[l];
       cols = new int[l];
       l = 0;
       for (int row = 0; row < 9; row++) {
           for (int col = 0; col < 9; col++) {
               if (grid_[row][col] != 0) {
                   rows[l] = row;
                   cols[l] = col;
                   l++;
               }
           }
       }
       l = 0;
       for (int row = 0; row < 9; row++)
       {
           for (int col = 0; col < 9; col++)
           {
               if(l < rows.length && row == rows[l] && col == cols[l])
               {
                   l++;
               }
               else {
                   boolean legal = false;
                   while (!legal)
                   {
                       grid_[row][col] = (int) (Math.random() * 9) + 1;
                       int[] sees = new int[27];
                       for (int i = 0; i < 9; i++)
                       {
                           sees[i] = grid_[row][i];
                       }
                       for (int i = 9; i < 18; i++)
                       {
                           sees[i] = grid_[i - 9][col];
                       }
                       int f = 0;
                       int m = 18;
                       for (int j = 0; j < 9; j += 3)
                       {
                           for (int x = 0; x < 9; x += 3)
                           {
                               if (row >= j && row < j + 3 && col >= x && col < x + 3)
                               {
                                   for (int r = j; r < j + 3; r++)
                                   {
                                       for (int c = x; c < x + 3; c++)
                                       {
                                           sees[m] = grid_[r][c];
                                           if (r == row && c == col)
                                           {
                                               f = m;
                                           }
                                           m++;
                                       }
                                   }
                               }
                           }
                       }
                       sees[col] = 0;
                       sees[row + 9] = 0;
                       sees[f] = 0;
                       for (int i = 0; i < 27; i++)
                       {
                           if (sees[i] == grid_[row][col])
                           {
                               break;
                           }
                           if (i == 26)
                           {
                               legal = true;
                           }
                       }
                       if (isFull(sees))
                       {
                           int w = 0;
                           for (int r = 0; r < 9; r++)
                           {
                               for (int c = 0; c < 9; c++)
                               {
                                   if (w < rows.length && r == rows[w] && c == cols[w])
                                   {
                                       w++;
                                   }
                                   else
                                   {
                                       grid_[r][c] = 0;
                                   }
                               }
                           }
                           row = 0;
                           col = -1;
                           l = 0;
                           legal = true;
                       }
                   }
               }
           }
       }
       for (int row = 0; row < grid_.length; row++)
       {
           for (int col = 0; col < grid_[0].length; col++)
           {
               System.out.print(grid_[row][col] + "  ");
           }
           System.out.println();
       }
   }


   public int get(int row, int col) {
       return grid[row][col];
   }
   public void set(int row, int col, int value) {
       grid[row][col] = value;
   }
   public int[][] getGrid() {
       return grid;
   }
}
