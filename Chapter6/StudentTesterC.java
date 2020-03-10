/**
 * @author      : root (root@xander-MS-7B49)
 * @file        : StudentTesterC
 * @created     : Saturday Oct 19, 2019 22:47:13 PDT
 */

public class StudentTesterC
{
    public StudentTesterC()
    {
        
    }
	public static void main(String [] args)
	{
		Student s1 = new Student("", -1, 123, 145);
		boolean validation = s1.isValid();
		System.out.println(validation);
		Student s2 = new Student();
		System.out.println(s2.isValid());
	}

}


