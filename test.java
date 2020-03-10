public class test
{

public static void main (String [] args)
{
	int[][] stocks = new int[3][4];
	int[] i = new int[4];
	for(int n = 0; n < i.length; n++)
	{
		i[n] = 1;
	}
	stocks[0] = i;
	for(int n = 0; n < i.length; n++)
	{
		System.out.print(stocks[0][n]);
	}
}
}
