/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : PrimeMachine
 * @created     : Friday Dec 20, 2019 09:00:19 PST
 */
import java.lang.Math;
public class PrimeMachine
{
   private int []aPrimes;
	 public PrimeMachine(int numPrimes)
	 {
			aPrimes = new int[numPrimes];
	 		for(int n : aPrimes)
				n = 0;
	 }
	 public boolean isPrime(int n)
	 {
			boolean prime = true;
		  for(int c = 2; c <= n / 2; c++)
			{
				if(n % c == 0)
					prime = false;
			}
			return prime;
	 }
	 
	 public void findPrimesLessThan(int n)
	 {
			int aPos = 0;
		  for(int c = 2; c <= n; c++)
			{
				if(aPos == aPrimes.length)
				{
					System.out.println("Error with your array size");
					return;
				}
				if (isPrime(c))
				{
					aPrimes[aPos] = c;
					++aPos;
				}
			}
	 }

	 public int []getPrimesArray()
	 {
			int c = 0;
			while(c != aPrimes.length && aPrimes[c] != 0)
				c++;
			int []primesArray = new int[c];
			for(int c1 = 0; c1 < c; c1++)
				primesArray[c1] = aPrimes[c1];
			return primesArray;
	 }
	 public boolean isBigPrime(int n)
	 {
			boolean prime = true;
			int []primesArray = getPrimesArray();
			double sqrt = Math.sqrt( (double) n );
		  for(int c = 0; c < primesArray.length; c++)
			{
				  if(primesArray[primesArray.length - 1] < (int)sqrt)
					{
						System.out.println("Largest prime is less than square root");
						return false;
					}
					if(n % primesArray[c] == 0)
					{
						prime = false;
					}
			}
			return prime;
	 }

	 public String toString()
	 {
			String s = "";
			int []logicalArray = getPrimesArray();
			for(int n = 0; n < logicalArray.length; n++)
			{
				s += (" " + logicalArray[n]);
			}
			return s;
	 }

}


