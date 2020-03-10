/**
 * @author      : xander (xander@Xanders-MacBook-Air.local)
 * @file        : Tester
 * @created     : Tuesday Mar 03, 2020 10:22:53 PST
 */

public class Tester
{
   public static void main(String []args)
   {
	   ArrayList n = new ArrayList();
	   System.out.println(n);
	   n.add(0,1);	   
   	   n.add(1,3);
	   n.add(2,44);
	   n.add(3,32);
	   n.add(4,234);
	   n.add(5,23423);
	   System.out.println(n);
	   n.remove(1);
	   System.out.println(n);
   }
}


