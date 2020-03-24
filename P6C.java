import images.*;
public class P6C
{
	public static void grayScale(APImage image, int x1, int y1, int x2, int y2)
	{
		for(int y = y1; y < y2; y++)
		{
			for(int x = x1; x < x2; x++)
			{
				Pixel p = image.getPixel(x,y);
				int avg = (int)((p.getBlue() + p.getRed() + p.getGreen())/3);
				p.setGreen(avg);
				p.setRed(avg);
				p.setBlue(avg);
			}
		}
	}
	public static void main(String [] args)
	{
		APImage image = new APImage(args[0]);
		int w = image.getImageWidth();
		int h = image.getImageHeight();
		int n = 4; // number of rectangles;
		for (int i = 0; i < n; i+= 2)
		{
			for (int j = 0; j < n; j += 2)
			{
				// It's alternating the order at which it executes the grayscale thing, to make a checkerboard
				// It does the w/n so it can make the tiles a certain size
				grayScale(image, i * w/n, j *h/n, (i +1) * w/n, (j +1) * h/n);
				grayScale(image, (i +1) * w/n, (j +1) * h/n, (i +2) *w/n -1, (j + 2) * h/n -1);
			}
		}
		image.draw();
	}


}

