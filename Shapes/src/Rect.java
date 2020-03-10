import TurtleGraphics.StandardPen;

public class Rect extends Shape {

    private double height, width;

    public Rect() {
        super();
        height = 1;
        width = 1;
    }

    public Rect (double xLoc, double yLoc, double w, double h) {
        super(xLoc, yLoc);
        height = h;
        width = w;
    }

    public double area() {
        return height * width;
    }
		public double perimeter()
		{
			return height * 2 + width * 2;
		}
    public void draw (StandardPen p) {
        p.up();
        p.move (xPos, yPos);
        p.down();
        p.setDirection (0); p.move (width);
        p.turn (-90); p.move (height);
        p.turn (-90); p.move (width);
        p.turn (-90); p.move (height);
    }

    public void stretchBy (double factor) {
        height *= factor;
        width *= factor;
    }

    public String toString() {
        String str = "RECTANGLE\n"
                + "Width & Height: " + width + " & " + height +"\n"
                + super.toString();
        return str;
    }
}
