/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : Asteroid
 * @created     : Wednesday Feb 05, 2020 21:06:42 PST
 */
import processing.core.PApplet;
public class Asteroid extends Floater
{
    private int rotationSpeed;
	public Asteroid(PApplet applet_)
    {
        super(applet_);
		rotationSpeed = (int)(Math.random() * 7) - 3;
		int x = (int)(Math.random() * 2) + 1;
		switch (x)
		{
			case 1:
				a1();
				break;
			case 2: 
				a2();
				break;
		}
		myXspeed = Math.random() * 4 - 2;
		myYspeed = Math.random() * 4 - 2;
		myCenterX = (int)(Math.random() * 1000);
		myCenterY = (int)(Math.random() * 500);
		myColor = 255;
		myColor1 = 255;
		myColor2 = 255;
	}

	public void show ()  //Draws the floater at the current position  
    {             
        applet.fill(0);   
        applet.stroke(myColor, myColor1, myColor2);    
        //translate the (x,y) center of the ship to the correct position
    	applet.translate((float)myCenterX, (float)myCenterY);

		//convert degrees to radians for rotate()     
		float dRadians = (float)(myPointDirection * (Math.PI / 180));
	
		//rotate so that the polygon will be drawn in the correct direction
		applet.rotate(dRadians);
	
		//draw the polygon 
 		applet.beginShape();
		for (int i = 0; i < corners; i++)
		{
		  applet.vertex(xCorners[i], yCorners[i]);
		}
		applet.endShape(applet.CLOSE);

		//"unrotate" and "untranslate" in reverse order
		applet.rotate(-1 * dRadians);
		applet.translate(-1 * (float)myCenterX, -1 * (float)myCenterY);
    	
	}
	private void a1()
	{
		corners = 5;
		xCorners = new int[5];
		yCorners = new int[5];
		xCorners[0] = -25;
		yCorners[0] = 4;
		xCorners[1] = 4;
		yCorners[1] = 25;
		xCorners[2] = 4;
		yCorners[2] = -4;
		xCorners[3] = -4;
		yCorners[3] = -4;
		xCorners[4] = -10;
		yCorners[4] = -10;
	}
	private void a2()
	{
		corners = 6;
		xCorners = new int[6];
		yCorners = new int[6];
		xCorners[0] = -10;
		yCorners[0] = 7;
		xCorners[1] = -5;
		yCorners[1] = 15;
		xCorners[2] = 10;
		yCorners[2] = 10;
		xCorners[3] = 14;
		yCorners[3] = -14;
		xCorners[4] = 5;
		yCorners[4] = -10;
		xCorners[5] = -7;
		yCorners[5] = -10;
	}
	public float getX()
	{
		return (float)myCenterX;
	}
	public float getY()
	{
		return (float)myCenterY;
	}
	public void move()
	{
		turn(rotationSpeed);
		super.move();
	}
}


