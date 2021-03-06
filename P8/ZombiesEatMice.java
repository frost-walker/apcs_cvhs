/**
 * @author      : xanderdejesus (xanderdejesus@Xanders-MacBook-Air.local)
 * @file        : ZombiesEatMice
 * @created     : Thursday Nov 07, 2019 15:49:51 PST
 */

import processing.core.PApplet;

public class ZombiesEatMice extends PApplet
{
    private Zombie[] zombies;
    private int zombieCount = 10;

    public static void main(String[] args)
    {
        PApplet.main("ZombiesEatMice");
    }

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        zombies = new Zombie[zombieCount];
        for (int i = 0; i < zombieCount; i++)
        {
            zombies[i] = new Zombie(width / 2, height / 2);
        }
    }

    public void draw()
    {
        background(0);
        for (Zombie z : zombies)
        {
            fill(200);
            ellipse(z.getX(), z.getY(), 10, 10);
            z.walkToward(mouseX, mouseY);
        }
    }
}


