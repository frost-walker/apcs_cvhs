/*
 * @author      : root (root@xander-MS-7B49)
 * @file        : Student
 * @created     : Friday Oct 18, 2019 22:42:38 PDT
 */
public class Student
{
    // Instance variables
    // Each student object has a name and three test scores
    private String name;    // Student name
    private int test1;      // Score on test 1.
    private int test2;      // Score on test 2.
    private int test3;      // Score on test 3.

    // Constructor method

    public Student()
    {
        // Initialize a new student's name to the empty string and the test
        // scores to zero.
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
	public Student(String n, int t, int t1, int t2)
	{
		name = n;
		test1 = t;
		test2 = t1;
		test3 = t2;
	}
	public Student(Student s)
	{
		name = s.name;
		test1 = s.test1;
		test2 = s.test2;
		test3 = s.test3;
	}
	public boolean isValid(){
		return ( !(name.equals("")) && (test1 >= 0 && test1 <= 100) && (test2 >= 0 && test2 <=100)&& (test3 >= 0 && test3 <= 100));

	}

    // Other methods    
    public void setName(String nm)
    {
        // Set a student's name
        name = nm;
    }

    public String getName()
    {
        // Get a student's name
        return name;
    }

    public void setScore(int i, int score)
    {
        // Set test i to score
        if(i == 1)
        {
            test1 = score;
        }
        else if(i==2)
        {
            test2 = score;
        }
        else
        {
            test3 = score;
        }
    }

    public int getScore(int i)
    {
        // Retrieve score i
        if(i == 1)
        {
            return test1;
        }
        else if(i==2)
        {
            return test2;
        }
        else
        {
            return test3;
        }
    }

    public int getAverage()
    {
        // Compute and return the average
        int average;
        average = (int) Math.round((test1 + test2 + test3)/3.0);
        return average;
    }

    public int getHighScore()
    {
        int highScore;
        highScore = test1;
        if(test2 > highScore)
        {
            highScore = test2;
        }

        if(test3 > highScore)
        {
            highScore = test3;
        }
        return highScore;
    }

    public String toString()
    {
        // Construct and return a string representation of the student
        String str;
        str = "Name:    " + name  + "\n" + // "\n" denotes a newline
        "Test 1:  " + test1 + "\n" +
        "Test 2:  " + test2 + "\n" +
        "Test 3:  " + test3 + "\n" +
        "Average: " + getAverage();
        return str;
    }
}
/*public class Student
{
    private String name;
	private double []testScores = new double[3];
	private double highestScore()
	{
		double highScore = 0;
		for (double x : this.testScores)
		{
			highScore = x > highScore ? x : highScore;
		}
		return highScore;
	}
	public Student()
	{
		this.name = "John";
		this.testScores[0] = 100.0;
		this.testScores[1] = 100.0;
		this.testScores[2] = 100.0;
	}
	public Student(String n, double t, double t1, double t2)
	{
		this.name = n;
		this.testScores[0] = t;
		this.testScores[1] = t1;
		this.testScores[2] = t2;
	}
	public  void changeName(String n)
	{
		this.name = n;
	}
	public  void changeScore (double s)
	{
		this.testScores[0] = s;
	}
	public  void printStudent ()
	{
		System.out.println(this.name);
		System.out.println(this.highestScore());
	}
	public boolean isValid()
	{
		if(this.name == "")
			return false;
		int cont = this.testScores.length;
		for(int x =0; x < cont; x++)
		{
			if((int)(this.testScores[x]) > 100 || (int)(this.testScores[x]) < 0)
				return false;
		}
		return true;
		
	}
	public Student (Student s)
	{
		name = s.name;
		testScores[0] = s.testScores[0];
		testScores[1] = s.testScores[1];
		testScores[2] = s.testScores[2];
	}
}*/


