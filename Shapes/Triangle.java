/**
 * @author      : newuser (newuser@News-MacBook-Air.local)
 * @file        : Triangle
 * @created     : Monday Jan 27, 2020 12:00:41 PST
 */
import TurtleGraphics.StandardPen;
public class Triangle extends Shape
{
    private double vX1, vY1, vX2, vY2, vX3, vY3;
		public Triangle()
    {
    	super();    
    }
		public Triangle(double xLoc, double yLoc)
		{
			super(xLoc, yLoc);
			vX1 = xPos;
			vY1 = yPos;
		}
		public void move(double xLoc, double yLoc)
		{
			double xS = xLoc - xPos;
			double yS = yLoc - yPos;
			vX1 += xS;
			vX2 += xS;
			vX3 += xS;
			vY1 += yS;
			vY2 += yS;
			vY3 += yS;
		}
		public double area()
		{
			return 1 / 2 * (vX1 * vX2 - vX2 * vY1 + vX2 * vY3 - vX3 * vY2 + 
					vX3 * vY1 - vX1 * vY3);
		}
		public void stretchBy(double factor)
		{
			vX2 = vX1 + (vX2 - vX1) * factor;
			vX3 = vX1 + (vX3 - vX1) * factor;
			vY2 = vY1 + (vY2 - vY1) * factor;
			vY3 = vY3 + (vY3 - vY1) * factor;
		}
		public double perimeter()
		{
			return Math.sqrt((vX1 - vX2) * (vX1 - vX2) + (vY1 - vY2) * (vY1 - vY2)) 
				+ Math.sqrt((vX2 - vX3) * (vX2 - vX3) + (vY2 - vY3) * (vY2 - vY3)) 
				+ Math.sqrt((vX1 - vX3) * (vX1 - vX3) + (vY1 - vY3) * (vY1 - vY3));
		}
		public void draw(StandardPen p)
		{
			p.up();
			p.move(vX1, vY1);
			p.down();
			p.move(vX2, vY2);
			p.move(vX3, vY3);
			p.move(vY1, vY1);
		}
}


