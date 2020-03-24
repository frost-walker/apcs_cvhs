/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : P10D
 * @created     : Friday Dec 06, 2019 12:34:28 PST
 */

public class P10D
{
	public static void main(String[] args)
	{
		int[] nums = {3, 7, 4, 0, 4, 1, 5, -2, 4, 5, 2};
		// values[] will hold each unique number from the nums[] array.
		int[] values = new int[nums.length];
		// The values[] array is not full. numValues will hold its logical size...
		int numValues = findUniqueValues(nums, values);
		printNums(nums, nums.length);
		System.out.println();
		printNums(values, numValues);
	}

	public static void printNums(int []nums, int s)
	{
		for(int n = 0; n < s; n++)
		{
			System.out.print(nums[n]);
		}
	}

	public static int findUniqueValues(int []nums, int []nums1)
	{
		int l = 0;
		for(int n = 0; n < nums.length; n++)
		{
			int c = -1;
			do{
				c++;
			}while(c < l && nums[n] != nums1[c]);
			if(c == l)
				nums1[l++] = nums[n];
		}
		return l;
	}
}


