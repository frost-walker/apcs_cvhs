/**
 * @author      : root (root@xander-MS-7B49)
 * @file        : StudentTesterA
 * @created     : Friday Oct 18, 2019 23:35:49 PDT
 */

public class StudentTesterA
{
    public StudentTesterA()
    {
        
    }
	public static void main (String [] args)
	{
		Student s1 = new Student();
		s1.setName("Hello");		
		System.out.println(s1.toString());
		s1.setScore(5, 99);
		System.out.println(s1.getHighScore());
		int x = 1;
		double high = s1.getScore(1);
		if(high < s1.getScore(2))
		{
			high = s1.getScore(2);
			x++;
		}
		if(high < s1.getScore(3))
		{
			high = s1.getScore(3);
			x = 3;
		}
		System.out.println("test " + x + " was highest score, at " + high);
	}
}


