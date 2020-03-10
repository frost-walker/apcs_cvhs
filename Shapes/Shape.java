
import TurtleGraphics.StandardPen;

public class Shape
{
    protected double xPos;
    protected double yPos;

    // Even though this class is never instantiated, it needs constructors to initialize its variables
    public Shape()
    {
        xPos = 0;
        yPos = 0;
    }

    public Shape(double xLoc, double yLoc)
    {
        xPos = xLoc;
        yPos = yLoc;
    }

    // There is no code for the next three methods. We know that subclasses of Shape will override
    // them with appropriate code. We include them here so that a variable of type Shape can be declared,
    // like: Shape r = new Rect(). You can then say r.draw(p) and it will work. The code compiles because
    // variable r has a draw() method (in class Shape). While the program is running, it will see that r is
    // actually of type Rect, and will use Rect's draw() method instead of the one in Shape.

    public double area()
    {
        return 0;
    }

    public void draw(StandardPen p)
    {

    }

    public void stretchBy(double factor)
    {

    }


    // These next three methods will never be changed in a subclass; therefore they
    // are declared final, meaning they cannot be overridden.

    public final double getXPos()
    {
        return xPos;
    }

    public final double getYPos()
    {
        return yPos;
    }

    public void move( double xLoc, double yLoc)
    {
        xPos = xLoc;
        yPos = yLoc;
    }

    // Subclasses will override this method. Notice that the method calls area().
    // This will activate the area method of the subclass.
    public String toString()
    {
        String str = "(X,Y) Position: (" + xPos + "," + yPos + ")\n:"
                + "Area: " + area();
        return str;
    }

		public double perimeter()
		{
				return 0;
		}
}
