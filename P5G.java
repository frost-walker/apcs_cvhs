import images.*;
import java.util.Scanner;
public class P5G
{
	public static void main(String [] args)
	{
		System.out.println("Enter in first corner.");
		Scanner reader = new Scanner(System.in);
		int firstcornerx = reader.nextInt();
		int firstcornery = reader.nextInt();
		System.out.println("Enter in second corner.");
		int secondcornerx = reader.nextInt();
		int secondcornery = reader.nextInt();
		System.out.println("Enter in a dimness factor");
		int dimnessfactor = reader.nextInt();
		APImage picture = new APImage("picture.jpg");
		int height = picture.getImageHeight();
		int width = picture.getImageWidth();
		for(int row = 0; row < height; row++)
		{
			for (int col = 0; col < width; col++)
			{
				if(col >= firstcornerx && col <= secondcornerx && row >= firstcornery && row <= secondcornery)
					continue;
				Pixel n = picture.getPixel(col, row);
				int red = n.getRed();
				int green = n.getGreen();
				int blue = n.getBlue();
				int dimnessfactor1 = red - dimnessfactor;
			    dimnessfactor1 = dimnessfactor1 > 0 ? dimnessfactor1 : 0;
				n.setRed(dimnessfactor1);
				dimnessfactor1 = green - dimnessfactor;
				dimnessfactor1 = dimnessfactor1 > 0 ? dimnessfactor1 : 0;
				n.setGreen(dimnessfactor1);
				dimnessfactor1 = blue - dimnessfactor;
				dimnessfactor1 = dimnessfactor1 > 0 ? dimnessfactor1 : 0;
				n.setBlue(dimnessfactor1);
			}
		}
		picture.draw();

	}


}

