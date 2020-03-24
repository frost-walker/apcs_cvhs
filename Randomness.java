import images.*;
public class Randomness
{
	public static void main(String [] args)
	{
		APImage randompic = new APImage(args[0]);
		for (Pixel p: randompic)
		{
			int num = (int)(p.getRed());
			int num1 = (int)(p.getGreen());
			int num2 = (int)(p.getBlue());
			p.setRed(num1);
			p.setGreen(num2);
			p.setBlue(num);
		}
		randompic.draw();

	}


}

