import images.*;
public class P5A
{
	public static void main(String [] args)
	{
		APImage picture = new APImage(400,200);
		for(Pixel p: picture)
		{
			p.setRed(255);
			p.setGreen(0);
			p.setBlue(0);
		}
		picture.draw();
	}


}

