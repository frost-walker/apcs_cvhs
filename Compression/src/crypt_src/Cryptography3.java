/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-Air.attlocal.net)
 * @file        : Cryptography3
 * @created     : Monday Jan 13, 2020 21:04:50 PST
 */
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
public class Cryptography3
{
	public static void Encrypt(String inputFilename, 
			String encryptedFilename, int shiftValue) throws IOException
	{
		Scanner reader = new Scanner(new File(inputFilename));
		PrintWriter writer = new PrintWriter(new File(encryptedFilename));
		while (reader.hasNextLine())
		{
			String n = reader.nextLine();
			EncryptWord(shiftValue, n, writer);
			writer.print('\n');
		}
		writer.close();
	}

	public static void EncryptWord(int shiftValue, String word, 
			PrintWriter writer)
	{
		for(int n = 0; n < word.length(); n++)
		{
			int x = (int)word.charAt(n);
			boolean isCap = (x <= 90);
			if(x < 65 || ( x > 90 && x < 97) || x > 122)
			{
				writer.print((char)x);
				continue;
			}
			x = isCap ? x - 90 + 25 : x - 122 + 25;
			x = CryptLib.combineX(shiftValue, x);
			writer.print(isCap ? CryptLib.asciiTableC[x] 
				: CryptLib.asciiTable[x]);
		}
	}

	public static void main(String [] args) throws IOException
	{
		Encrypt("sample2.txt", "output.txt", -12);
		Encrypt("output.txt", "sample3.txt", 12);
	}

}


