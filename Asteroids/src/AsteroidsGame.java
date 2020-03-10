import java.util.ArrayList;
import processing.core.PApplet;
public class AsteroidsGame extends PApplet
{
    //your variable declarations here
    private Spaceship sP;
    private Stars1[] sT;
	private ArrayList <Asteroid>  aS;
	private ArrayList <Bullet> bS;
	public static void main(String[] args)
    {
        PApplet.main("AsteroidsGame");
    }
	private void makeAst()
	{
		for(int i = 0; i < 100; i++)
		{
			aS.add(new Asteroid(this));
		}
	}
    public void settings()
    {
    	size(1000,500);
	}

    public void setup() 
    {
		background(0);
		sT = new Stars1[100];
		Stars1.makeStars(sT, this);
		sP = new Spaceship(this, sT);
		aS = new ArrayList <Asteroid>();
		bS = new ArrayList <Bullet>();
		makeAst();
	}
	
    public void draw() 
    {
		background(0);
        sP.move();
		showStars();
		sP.show();
        circle(100,100,4);
		int n = aS.size();
		for(int x = 0; x < n; x++)
		{
			Asteroid a = aS.get(x);
			a.move();
			a.show();
			if((dist(a.getX(), a.getY(), sP.getX(), sP.getY())) <= 20)
			{
				aS.remove(x);
				n = aS.size();
				--x;
				continue;
			}
			int n1 = bS.size();
			for(int x1 = 0; x1 < n1; x1++)
			{
				Bullet b = bS.get(x1);
				if((dist(b.getX(), b.getY(), a.getX(), a.getY())) <= 20)
				{
					bS.remove(x1);
					n1 = bS.size();
					--x1;
					aS.remove(x);
					n = aS.size();
					--x;
				}
			}
		}
		int n1 = bS.size();
		for(int x = 0; x < n1; x++)
		{
			Bullet b = bS.get(x);
			b.move();
			b.show();
			if(!(b.onMap))
			{
				bS.remove(x);
				--x;
				n1 = bS.size();
			}
		}
    	if (keyPressed)
        {   
                if (keyCode == LEFT)
                {
                    sP.turn(-5);
                }
                if (keyCode == RIGHT)
                {
                    sP.turn(5);
                }
		}
	}
	private void showStars()
	{
		for(int n = 0; n < sT.length; n++)
			sT[n].show();
	}

    public void keyPressed()
    {   
        if (keyCode == UP)
        {
            sP.accelerate(5);
        }
        if (key == 'h')
        {
            sP.hyperspace();
        }
		if (key == ' ')
		{
			bS.add(new Bullet(this, sP));
		}
    }
}

