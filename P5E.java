import images.APImage;
import images.Pixel;
public class P5E
{
   public static void main(String[] args)
   {
       APImage image = new APImage("copper-puzzle.png");
       for (Pixel p : image)
       {

           p.setRed(0);
           p.setBlue(p.getBlue() * 20);
           p.setGreen(p.getGreen() * 20);


       }
       image.draw();
   }
}

