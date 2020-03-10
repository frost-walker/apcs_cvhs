/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-Air.attlocal.net)
 * @file        : Prime
 * @created     : Saturday Dec 21, 2019 10:38:34 PST
 */

public class Prime
{
   public static boolean isPrime (int n)
	 {
			boolean prime = true;
			for(int c = 2; c <= n / 2; c++)
			{
				if(n % c == 0)
					prime = false;
			}
			return prime;
	 }
	 public static int[] findPrimesLessThan(int n)
	 {
		  int aPos = 0; 
			int []aPrimes = new int[n / 2];
			for(int c = 2; c <= n; c++)
			{
				if(isPrime(c))
				{
					aPrimes[aPos] = c;
					++aPos;
				}
			}
			return aPrimes;
	 }
	 public static boolean isBigPrime(int n)
	 {
			boolean prime = true;
			int []primesArray = findPrimesLessThan((int)Math.sqrt(n));
			for(int c : primesArray)
			{
				if(c == 0)
					break;
				if(n % c == 0)	
				prime = false;
			}
			return prime;
	 }
}


