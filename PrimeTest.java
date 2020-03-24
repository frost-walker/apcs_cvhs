/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-Air.attlocal.net)
 * @file        : PrimeTest
 * @created     : Saturday Dec 21, 2019 11:00:48 PST
 */
public class PrimeTest
{
	public static void main(String []args)
	{
		long ptime = System.currentTimeMillis();
		Prime.isBigPrime(1611623773);
		System.out.println(System.currentTimeMillis() - ptime);
	}
}


