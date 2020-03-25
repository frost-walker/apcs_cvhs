/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : test
 * @created     : Friday Jan 10, 2020 16:59:27 PST
 */
import java.util.Scanner;
import java.io.*;
public class test
{
    static int[] frequencies = {
			1,2,3,4
		};
	  public static void main (String [] args) throws IOException
		{
			PrintWriter writer = new PrintWriter(new File("output.txt"));
			String n = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int shiftVal = -12;
			Cryptography3.EncryptWord(shiftVal, n, writer);
			int x = 0;	
			System.out.println(-27 % 26);
			writer.close();
		}

}
