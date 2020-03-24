import images.APImage;
import images.Pixel;
public class P5D
{
   public static void main(String[] args)
   {
       APImage image = new APImage("iron-puzzle.png");
       for (Pixel p : smokey)
       {

           p.setRed(p.getRed() * 10);
           p.setBlue(0);
           p.setGreen(0);


       }
       smokey.draw();
   }
}


