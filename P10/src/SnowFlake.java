/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : SnowFlake
 * @created     : Saturday Dec 07, 2019 21:07:57 PST
 */

public class SnowFlake
{
    public float x;
		public float y;
		public int type;
		public SnowFlake()
    {
        x = 0;
				y = 0;
    }
		public void moveFlake()
		{
			switch(type)
			{
				case 0:
					x += 1.25;
					y += .75;
					break;
				case 1:
					x += .45;
					y += 1.5;
					break;
				case 2:
					x += 1;
					y += .25;
					break;
				case 3:
					x += 0;
					y += 1;
					break;
				case 4:
					x += 1;
					y += 1;
					break;
				
			}
			if(y >= 500)
			{
				x = (float)Math.random() * 500;
				y = -10;
			}
		}
		public void setX(float x)
		{
			this.x = x;
			/*if(x < 25)
				type = 0;
			if(x < 500 / 4)
			{
				type = 1;
			}
			if(x > 500 / 4 && x < 500 / 4 * 2)
				type = 2;
			if(x > 500 / 4 * 2 && x < 500 / 4 * 3)
				type = 3;
			if(x > 500 / 4 * 3)
				type = 4;
			*/	
		}
}


