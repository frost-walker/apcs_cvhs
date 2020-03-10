/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : P9E
 * @created     : Tuesday Dec 03, 2019 13:20:06 PST
 */
import java.io.*;
import java.util.Scanner;
public class P9E
{
	public static boolean finderR(Scanner reader, String searchFor)
	{
		if(!reader.hasNext())
			return false;
		String line = reader.nextLine();
		if(line.contains(searchFor))
			return true;
		return finderR(reader, searchFor);
	}
	public static boolean finder(String input, String searchFor) throws IOException
	{
		Scanner reader = new Scanner(new File(input));
		return(finderR(reader, searchFor));
	}
	public static void main(String []args) throws IOException
	{
		System.out.println(finder("sample1.txt", "e"));
	}
}
