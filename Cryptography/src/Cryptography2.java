/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-Air.attlocal.net)
 * @file        : Cryptography2
 * @created     : Monday Jan 13, 2020 20:40:54 PST
 */
import java.util.Scanner;
import java.io.*;
public class Cryptography2
{
    public static void main(String[] args) throws IOException
		{
			String fileName = "output.txt";
			double [] frequencies = fileLetterFrequencies(fileName);
			for(int i = 0; i < frequencies.length; i++)
			{
				System.out.println((char) (i + 65) + " " + frequencies[i]);
			}
		}

		public static double[] fileLetterFrequencies(String fileName) 
				throws IOException
		{
			double[] frequencies = new double[26];
			Scanner fReader = new Scanner(new File(fileName));
			while(fReader.hasNext())
			{
				String n = fReader.next();
				copy(frequencies, Cryptography1.stringLetterFrequencies(n));				
			}
			double total = 0;
			for(double d : frequencies)
				total += d;
			for(int n = 0; n < frequencies.length; n++)
			{
				frequencies[n] = frequencies[n] / total * 100;
			}
			return frequencies;
		}

		private static void copy (double []a, int[]b)
		{
			for(int n = 0; n < a.length; n++)
			{
				a[n] += b[n];
			}
			return;
		}
}


