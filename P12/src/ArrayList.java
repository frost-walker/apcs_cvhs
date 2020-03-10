/**
 * @author      : xander (xander@Xanders-MacBook-Air.local)
 * @file        : ArrayList
 * @created     : Monday Mar 02, 2020 09:21:15 PST
 */
public class ArrayList
{
    private Object[] array;
	private int logicalSize;
	public ArrayList()
	{
		array = new Object[5];
		logicalSize = 0;
	}
	public ArrayList(int a)
    {
    	array = new Object[a];
		logicalSize = 0;
	}
	public ArrayList(Object[] a)
	{
		int n = 0;
		while(n < a.length)
			n++;
		logicalSize = n;
		array = new Object[logicalSize];
		for(int x = 0; x < n; x++)
			array[x] = a[x];
	}
	public int size(){return logicalSize;}
	public String toString()
	{
		String s = "[ ";
		for(int i = 0; i < logicalSize; i++)
		{
			s += (array[i].getClass() == String.class) ? "\"" + array[i] 
				+ "\"" : array[i];
			s += i == logicalSize - 1 ? " ]" : ", ";
		}
		return logicalSize != 0 ? s : "Empty Array";
	}
	public Object get(int i)
	{
		if(0 > i)
			throw new IndexOutOfBoundsException("\nNo negative indices");
		else if(logicalSize == 0)
			throw new IndexOutOfBoundsException("\nNothing in Array");
		else if(i >= logicalSize)
			throw new IndexOutOfBoundsException("\nToo Big Index");	
		return array[i];
	}
	public Object remove(int i)	
	{
		if(i >= logicalSize)
			throw new ArrayIndexOutOfBoundsException("Index too big");
		if(i < 0)
			throw new ArrayIndexOutOfBoundsException("No negative indices");
		logicalSize--;
		Object j = array[i];
		Object[] n = new Object[logicalSize];
		for(int a = logicalSize; a > i; a--)
			n[a - 1] = array[a];	
		for(int a = 0; a < i; a++)
			n[a] = array[a];
		array = n;
		return j;
	}
	public boolean add(int i, Object o)
	{		
		try 
		{
			for(int a = logicalSize; a > i; a--)
				array[a] = array[a - 1];
			logicalSize++;
			array[i] = o;
			return true; 
		}
		catch(Exception x)
		{
			logicalSize--;
			if(i < 0)
				throw new IndexOutOfBoundsException(x + "\nNo negative indices");
			if(i > logicalSize)
				throw new IndexOutOfBoundsException(x + "\nIndex too big");
			Object[] z = new Object[++logicalSize];
			for(int n = 0; n < i; n++)
				z[n] = array[n];
			z[i] = o;
			for(int n = i; n < logicalSize - 1; n++)
				z[n + 1] = array[n];
			array = z;
			return true;
		}
	}
}
