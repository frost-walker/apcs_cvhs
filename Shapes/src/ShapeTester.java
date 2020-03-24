/**
 * @author      : newuser (newuser@News-MacBook-Air.local)
 * @file        : ShapeTester
 * @created     : Monday Jan 27, 2020 14:04:39 PST
 */
import TurtleGraphics.StandardPen;
public class ShapeTester
{
   public static void main(String [] args)
	 {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(10, -50, 15);
		shapes[1] = new Rect(6, 8, 12, 40);
		shapes[2] = new Triangle(-40, 70, -10, 50, -15, -50);
		shapes[3] = new Wheel(20, 50, 20 ,5);
		StandardPen sP = new StandardPen();
		SpokeS(shapes);
		draw(shapes, sP);
	 }
	 public static void draw(Shape[] array, StandardPen sP)
	 {
		for(Shape n : array)
		{
			n.draw(sP);
		}
	 }
	 public static void SpokeS(Shape[] array)
	 {
		for(Shape n : array)
		{
			if(n instanceof Wheel)
			{
				((Wheel) n).setSpokes(6);
			}
		}
	 }
}


