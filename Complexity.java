/**
 * @author      : xander (xander@Xanders-MacBook-Air.local)
 * @file        : Complexity
 * @created     : Tuesday Feb 25, 2020 13:15:38 PST
 */

public class Complexity
{
    public static void main(String[] args)
	{
		int[] nums = new int[10];
		nums[0] = 3;
		nums[1] = 7;
		nums[2] = 21;
		nums[3] = 26; 
		nums[4] = 31;
		insert(nums, 2, 11);
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}

	public static void insert(int[] nums, int index, int value)
	{
		for(int i = nums.length - 1, i > index; i--)
		{
			nums[i] = nums[i-1];
		}
	}
}


