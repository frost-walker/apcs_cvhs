/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : P9C
 * @created     : Thursday Nov 21, 2019 11:58:27 PST
 */
import java.io.*;
import java.util.Scanner;
public class P9C
{
    public static void main(String [] args)
    {
    	Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of rows for stars");
		int nRows = reader.nextInt();
		for(int cont = 1; cont <= nRows; cont++)
		{
			for(int cont1 = 0; cont1 < nRows - cont; cont1++)
			{
				System.out.print(' ');
			}
			for(int cont2 = 0; cont2 < cont; cont2++)
			{
				System.out.print('*');
			}
			System.out.print('\n');
		}
		for(int cont = 0; cont < nRows; cont++)
		{
			for(int cont1 = 0; cont1 <= cont; cont1++)
			{
				System.out.print('*');
			}
			for(int cont2 = 0; cont2 < (nRows - (cont + 1)) * 2; cont2++)
			{
				System.out.print(' ');
			}
			for(int cont1 = 0; cont1 <= cont; cont1++)
			{
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}
}


