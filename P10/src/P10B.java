/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : P10B
 * @created     : Friday Dec 06, 2019 09:33:24 PST
 */
import java.util.Scanner;
import java.io.*;
public class P10B
{
   public static void makeArray(Scanner reader, String []words) throws IOException
   {
		int n = 0;
	   	while(reader.hasNextLine())
		{
			while(reader.hasNext() && n < words.length)
			{
				words[n] = reader.next();
				n++;
			}
		}
   }
   public static void main(String []args) throws IOException
   {
		Scanner reader = new Scanner(new File("../sample1.txt"));
		String[]words = new String [100];
		makeArray(reader, words);
		for(int n = 0; n < words.length; n++)
		{
			System.out.println(words[n]);
		}
   }
}


