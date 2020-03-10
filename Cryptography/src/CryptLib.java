/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-Air.attlocal.net)
 * @file        : CryptLib
 * @created     : Monday Jan 13, 2020 21:10:49 PST
 */

public class CryptLib
{
	public static double[] frequencies = {
		8.167, 1.492, 2.202, 4.253, 12.702, 2.228, 2.105, 6.094, 6.966,
		.153, 1.292, 4.025, 2.406, 6.749, 7.507, 1.929, .095, 5.987, 6.327,
		9.356, 2.758, .978, 2.560, .150, 1.994, .077
	};
	public static char[] asciiTable = {
		'a','b','c','d','e','f',
		'g','h','i','j','k','l',
		'm','n','o','p','q','r','s','t','u','v','w','x','y','z'
	};

	public static char[] asciiTableC = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
		'U', 'V', 'W', 'X', 'Y', 'Z'
	};

	public static int combineX(int a, int b)
	{
		a = a % 26;
		int x = a + b;
		if(x < 0)
			x = 25 + a + b + 1;
		else if(x > 25)
		{
			if(x % 25 == 0)
				x = 25;
			else
				x = (x % 25) - 1;
		}
		return x;
	}
	
}


