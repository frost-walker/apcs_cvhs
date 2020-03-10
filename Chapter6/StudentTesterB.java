/**
 * @author      : root (root@xander-MS-7B49)
 * @file        : StudentTesterB
 * @created     : Saturday Oct 19, 2019 18:30:00 PDT
 */

public class StudentTesterB
{
    public StudentTesterB()
    {
        
    }
	public static void main (String [] args)
	{
		Student s1 = new Student("Rando", 100, 99.9, 91.9);
		System.out.println(s1.toString());
		Student s2 = new Student(s1);
		System.out.println(s2.toString());
	}
}


