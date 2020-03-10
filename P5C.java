import images.APImage;
import images.Pixel;
public class P5C
{
   public static void main(String[] args)
   {
       APImage smokey = new APImage("smokey.jpg");
       int width = smokey.getImageWidth();
       System.out.println(width);
       int height = smokey.getImageHeight();
       System.out.println(height);
       Pixel redPixel = new Pixel(255,0,0);
	   int middlewidth = (int)(width/2);
	   int middleheight = (int)(height/2);
       for (int x = 0; x  < width; x++)
       {
           smokey.setPixel(x, middleheight, redPixel);
       }
       for(int y = 0; y < height; y++)
       {
           smokey.setPixel( middlewidth ,y, redPixel);
       }


       smokey.draw();
   }
}

