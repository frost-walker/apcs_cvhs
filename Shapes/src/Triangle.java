/**
 * @author      : newuser (newuser@News-MacBook-Air.local)
 * @file        : Triangle
 * @created     : Monday Jan 27, 2020 12:00:41 PST
 */
import TurtleGraphics.StandardPen;
public class Triangle extends Shape
{
    	private double vX3, vY3, vX2, vY2;
		public Triangle()
    	{
    		super();
			vX2 = 1;
			vY2 = 0;
			vX3 = 0;
			vY3 = 1;
			
    	}
		public Triangle(double vx1, double vy1, double vx2, double vy2,
				double vx3, double vy3)
		{
			super(vx1, vy1);
			vX2 = vx2;
			vY2 = vy2;
			vX3 = vx3;
			vY3 = vy3;
		}
		public void move(double xLoc, double yLoc)
		{
			double xS = xLoc - xPos;
			double yS = yLoc - yPos;
			xPos += xS;
			yPos += yS;
			vX3 += xS;
			vX2 += xS;
			vY2 += yS;
			vY3 += yS;
		}
		public double area()
		{
			return 1 / 2 * (xPos * vX2 - vX2 * yPos + vX2 * vY3 - vX3 * vY2 + 
					vX3 * yPos - xPos * vY3);
		}
		public void stretchBy(double factor)
		{
			vX2 = xPos + (vX2 - xPos) * factor;
			vX3 = xPos + (vX3 - xPos) * factor;
			vY2 = yPos + (vY2 - yPos) * factor;
			vY3 = vY3 + (vY3 - yPos) * factor;
		}
		public double perimeter()
		{
			return Math.sqrt((xPos - vX2) * (xPos - vX2) + (yPos - vY2) * (yPos - vY2)) 
				+ Math.sqrt((vX2 - vX3) * (vX2 - vX3) + (vY2 - vY3) * (vY2 - vY3)) 
				+ Math.sqrt((xPos - vX3) * (xPos - vX3) + (yPos - vY3) * (yPos - vY3));
		}
		public void draw(StandardPen p)
		{
			p.up();
			p.move(xPos, yPos);
			p.down();
			p.move(vX2, vY2);
			p.move(vX3, vY3);
			p.move(xPos, yPos);
		}
}


