import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class MazeStarterCode
{
    public static void main(String[] args) throws IOException
    {
        // Import maze text file generated from:
        //     http://www.delorie.com/game-room/mazes/genmaze.cgi
        System.out.print("Name of maze text file: ");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();
        Scanner fileReader = new Scanner(new File(fileName));

        // Store text file into arrayList of Strings for each line
        List<String> lines = new ArrayList<String>();
        while (fileReader.hasNext())
        {
            lines.add(fileReader.nextLine());
        }

        // Convert array of Strings into 2D array of char
        int numRows = lines.size();
        int numCols = lines.get(0).length();
        char[][] maze = new char[numRows][numCols];
        for (int row = 0; row < numRows; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                maze[row][col] = lines.get(row).charAt(col);
            }
        }

        // Mark Start square
        maze[1][0] = 'S';
        printMaze(maze);
        
        // *** Your recursive method call goes here ***
        
        printMaze(maze);
    }
    
    // Your recursive method goes here
    
    private static void printMaze(char[][] maze)
    {
        for (int row = 0; row < maze.length; row++)
        {
            for (int col = 0; col < maze[0].length; col++)
            {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}