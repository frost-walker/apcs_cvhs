/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : Cryptography1
 * @created     : Friday Jan 10, 2020 09:33:18 PST
 */
import java.util.Scanner;
import java.io.*;
public class Cryptography1
{
	public static void main(String []args)
	{
		String word = "Aardvark";
		int[] frequencies = stringLetterFrequencies(word);
		for (int freq : frequencies )
		{
			System.out.print(freq + " ");
		}
		System.out.println();
	}

	public static int[] stringLetterFrequencies(String word) 
	{
		System.out.println("Filename : ");
		int []frequencies = new int[26];
		for(int n = 0, p = 0; n < word.length(); n++)
		{
			if((int)word.charAt(n) < 65 || ((int)word.charAt(n) 
						< 90 && (int)word.charAt(n) > 97) || word.charAt(n) > 122)
				continue;
			if((int)word.charAt(n) < 91)
			{
				p = 25 + word.charAt(n) - 90;
			}
			else
			{
				p = 25 + word.charAt(n) - 122;
			}
			frequencies[p] = frequencies[p] + 1;
		}

		return frequencies;
	}
}


