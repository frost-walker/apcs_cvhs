/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-Air.chabotcollege.edu)
 * @file        : test
 * @created     : Wednesday Dec 18, 2019 21:15:07 PST
 */
#include <iostream>
using namespace std;
int main()
{
	int penis[2][3];
	for(int c = 0; c < 2; c++)
	{
		for(int r = 0; r < 2; r++)
			cout << *(*(penis + c * 3) + r);
	}
}

