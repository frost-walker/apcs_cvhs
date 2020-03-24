import images.*;
public class P5B
{
	public static void main(String [] args)
	{
		APImage picture = new APImage("picture.jpg");
		for(Pixel p: picture)
		{
			int num = (int)(p.getRed() * .299 + p.getGreen() * .587 + p.getBlue() * .114);
			p.setRed(num);
			p.setGreen(num);
			p.setBlue(num);
		}
		picture.draw();
	}


}

