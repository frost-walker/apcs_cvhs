/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-Air.attlocal.net)
 * @file        : Cryptography4
 * @created     : Monday Jan 13, 2020 22:50:38 PST
 */
import java.io.*;
import java.util.Scanner;
public class Cryptography4
{
   public static void Decrypt(String inputFilename) throws IOException
	 {
			double []array = Cryptography2.fileLetterFrequencies(inputFilename);	
			double []shiftVals = new double[52];
			double smallestVal = 1000;
			int theShift = 0;
			int z = 0;
			for(int b = -26; b < 26; b++)
			{
				double shiftAverage = 0.0;
				for(int n = 0; n < array.length; n++)
				{
	 				int x = CryptLib.combineX(b, n);	
					shiftAverage += Math.abs(CryptLib.frequencies[n] - array[x]);
				}
				shiftVals[z] = shiftAverage;
				z++;
			}
			for(int n = 0; n < shiftVals.length; n++)
			{
				System.out.println(n + " " + shiftVals[n]);
			}
	 		for(int n = 0; n < shiftVals.length; n++)
			{
				if(shiftVals[n] < smallestVal)
				{
					theShift = n;
					smallestVal = shiftVals[n];
				}
			}
			theShift = theShift - 26;
			System.out.println(theShift);
			Cryptography3.Encrypt(inputFilename, "decrypted.txt", -theShift);

	 }
	 public static void main(String[] args) throws IOException
	 {
			Decrypt("output.txt");
	 }
}


