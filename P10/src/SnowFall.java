import processing.core.PApplet;
public class SnowFall extends PApplet
{
		private SnowFlake []n;
		final int size = 200;
    public static void main(String[] args)
    {
        PApplet.main("SnowFall");
    }

    public void settings()
    {
        size(500, 500);    
    }
		int p = 0;
    public void setup()
    {
      n = new SnowFlake[size];  
			for (int i = 0; i < size; i++)
        {
            n[i] = new SnowFlake();
						n[i].setX((float)Math.random() * 500);  // set random initial positions for the flakes
            n[i].y = (float)Math.random() * 500;  // Math.random() returns a double, so we cast to (float)

            n[i].type = (int)(Math.random() * 4) + 1;
						p = p == 4 ? 0 : ++p;
						ellipse(n[i].x, n[i].y, 5, 5); // We draw them here just to test whether our setup is working
                                                // Ordinarily they would only need to be drawn in the draw() loop
        }
    }
    // Your task: implement the draw() method so that the snowflakes slowly fall down the screen
    // When a flake reaches the bottom, it should reappear at the top, ideally with a new random 
    // x position so that the pattern of flakes does not repeat.
    public void draw()
    {
        // You'll probably want to start draw() with "background(0);"
        background(153,219,255);
				for(int i = 0; i < size; i++)
				{
					n[i].moveFlake();
					ellipse(n[i].x, n[i].y, 5, 5);
				}
        // Let it snow, let it snow, let it snow...
    }
}


