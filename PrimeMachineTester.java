/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : PrimeMachineTester
 * @created     : Friday Dec 20, 2019 09:35:57 PST
 */

public class PrimeMachineTester
{
   public static void main (String []args)
	 {
			long ptime = System.currentTimeMillis();
		  PrimeMachine machine = new PrimeMachine(50000);
			machine.findPrimesLessThan(45000);
			int nTest = 1611623773;
			machine.isBigPrime(nTest);
	 		System.out.println(System.currentTimeMillis() - ptime);
	 }
}


