/**
 * @author      : xander (xander@Xanders-MacBook-Air.local)
 * @file        : Bullet
 * @created     : Thursday Feb 20, 2020 13:43:26 PST
 */
import processing.core.PApplet;
public class Bullet extends Floater
{
    public boolean onMap;
    public Bullet(PApplet applet, Spaceship theShip)
    {
    	super(applet);
		myCenterX = theShip.myCenterX;
		myCenterY = theShip.myCenterY;
		myPointDirection = theShip.getPointDirection();
    	accelerate(12);
    	onMap = true;
    }
	public void show()
	{
		applet.circle((int)myCenterX, (int)myCenterY, 4);
	}
	public void move ()   //move the floater in the current direction of travel
    {      
        //change the x and y coordinates by myDirectionX and myDirectionY       
        myCenterX += myXspeed;    
        myCenterY += myYspeed;     

        //wrap around screen    
        if(myCenterX > applet.width)
        {     
            onMap = false;    
		}    
        else if (myCenterX < 0)
        {     
            onMap = false;
        }    
        if(myCenterY > applet.height)
        {    
            onMap = false;
        }   
        else if (myCenterY < 0)
        {      
            onMap =  false;
        }  
        return; 
    }
	public float getX()
	{
		return (float)myCenterX;
	}
	public float getY()
	{
		return (float)myCenterY;
	}
}


