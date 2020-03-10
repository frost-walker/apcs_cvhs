import images.APImage;
import images.Pixel;
public class P5F
{
   public static void main(String[] args)
   {
       APImage image = new APImage("west-puzzle.png");
       for (Pixel p : image)
       {

           p.setRed(0);
		   if(p.getBlue() < 16)
			   p.setBlue(16 * p.getBlue());
		   else
			   p.setBlue(0);
           p.setGreen(0);
		   p.setRed(p.getBlue());
		   p.setBlue(0);


       }
       image.draw();
   }
}

