import processing.core.PApplet;
public class Spaceship extends Floater
{   
	private Stars1[] sT;
    public Spaceship(PApplet applet_, Stars1[] sT)
	{
		super(applet_);
		corners = 3;
		myCenterX = 500;
		myCenterY = 400;
		xCorners = new int[3];
		yCorners = new int[3];
		xCorners[0] = -8;
		yCorners[0] = 2;
		xCorners[1] = -8;
		yCorners[1] = -2;
		xCorners[2] = 8;
		yCorners[2] = 0;
		myColor = 255;
		myColor1 = 255;
		myColor2 = 255;
		myYspeed = 0;
		myXspeed = 10;
		myPointDirection = 0;
		this.sT = sT;
	}
	public void hyperspace()
	{
		myCenterX = (int)(Math.random() * 1000);
		myCenterY = (int)(Math.random() * 500);
		myYspeed = 0;
		myXspeed = 0;
		Stars1.makeStars(sT, applet);
	}
	public void move()
	{
		super.move();
		if(myCenterX > applet.width || myCenterY > applet.height || myCenterY < 0 || myCenterX < 0)
			Stars1.makeStars(sT, applet);
	}
	public void keyPressed()
    {	
		if (applet.keyPressed)
        {   
			if (applet.key == applet.CODED)       // To check if a key that doesn't print anything is being held
            {
                if (applet.keyCode == applet.LEFT)
                {
                    turn(-5);
                }
                if (applet.keyCode == applet.RIGHT)
                {
                    turn(5);
                }
				if (applet.keyCode == applet.UP)
				{
					accelerate(3);
					move();
					decelerate(3);
				}
				if (applet.keyCode == applet.DOWN)
				{
					hyperspace();
					Stars1.makeStars(sT, applet);
				}
            }
        }
    }
	public float getX()
	{
		return (float)myCenterX;
	}

	public float getY()
	{
		return (float)myCenterY;
	}
	public double getPointDirection()
	{
		return myPointDirection;
	}
}
