/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : TrojanPride
 * @created     : Thursday Dec 12, 2019 13:49:24 PST
 */
// Xander de Jesus: Problem C
public class TrojanPride
{
    public static void main(String[] args)
		{
			String[] words = { "We" , "have", "Trojan", "Pride" };
			System.out.println("Trojan Pride: " + trojanPride(words));
			String[] words2 = {"Every", "Trojan", "has", "Pride"};
			System.out.println("Trojan Pride: " + trojanPride(words2));
			String str = "abcdef";
			for(int n = 0; n < str.length() - 1; n++)
			{
				System.out.println(str.substring(n, n + 2));
			}
		}
		public static boolean trojanPride(String[] words)
		{
			for(int n = 0; n < words.length - 1; n++)
			{
				if(words[n].equals("Trojan") && words[n + 1].equals("Pride"))
					return true;
			}
			return false;
		}
}


