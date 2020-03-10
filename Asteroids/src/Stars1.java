/**
 * @author      : xander (xander@Xanders-Air.attlocal.net)
 * @file        : Stars1
 * @created     : Monday Feb 03, 2020 23:06:08 PST
 */
import processing.core.PApplet;
public class Stars1 extends Stars
{
    public Stars1(PApplet applet_)
    {
        super(applet_);
		turn(Math.random() * 45);
		corners = 10;
		myColor1 = (int)(Math.random() * 255);
		myColor = (int)(Math.random() * 255);
		myColor2 = (int)(Math.random() * 255);
		xCorners = new int[10];
		yCorners = new int[10];
		myCenterX = (int)(Math.random() * 1000);
		myCenterY = (int)(Math.random() * 500 );
		myYspeed = (Math.random() * 3);
		/*
		xCorners[0] = 1;
		yCorners[0] = 1;
		xCorners[1] = 0;
		yCorners[1] = 1;
		xCorners[2] = 1;
		yCorners[2] = 1;
		xCorners[3] = 1;
		yCorners[3] = 2;
		xCorners[4] = 0;
		yCorners[4] = 0;
		xCorners[5] = 1;
		yCorners[5] = 1;
		xCorners[6] = 1;
		yCorners[6] = 1;
		xCorners[7] = 1;
		yCorners[7] = 1;
		xCorners[8] = 1;
		yCorners[8] = 1;
		xCorners[9] = 1;
		yCorners[9] = 1;
		*/
		xCorners[0] = 4;
		yCorners[0] = 4;
		xCorners[1] = 0;
		yCorners[1] = 4;
		xCorners[2] = 4;
		yCorners[2] = 1;
		xCorners[3] = 2;
		yCorners[3] = 6;
		xCorners[4] = 0;
		yCorners[4] = 0;
		xCorners[5] = 1;
		yCorners[5] = 4;
		xCorners[6] = 1;
		yCorners[6] = 3;
		xCorners[7] = 2;
		yCorners[7] = 2;
		xCorners[8] = 3;
		yCorners[8] = 3;
		xCorners[9] = 3;
		yCorners[9] = 4; 
    }
	public static void makeStars(Stars1[] sT, PApplet applet_)
	{
		for(int n = 0; n < sT.length; n++)
		{
			sT[n] = new Stars1(applet_);
		}
	}
}


