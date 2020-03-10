import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class P5I
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Name of photo to edit?");
        String filename = in.nextLine();
        System.out.print("Enlargement factor?");
        int enlargefactor = in.nextInt();
        APImage image = new APImage(filename);
        int width1 = image.getImageWidth();
        int height1 = image.getImageHeight();
        APImage newimage = new APImage(width1 * enlargefactor, height1 * enlargefactor);

        for (int x  = 0; x < width1; x++)
        {
            for (int y = 0; y < height1; y++)
            {


                for (int z = 0; z < enlargefactor; z++)
                {
                    for (int s = 0; s < enlargefactor; s++)
                    {
                        Pixel p = image.getPixel(x, y);
                        Pixel p1 = new Pixel(0,0, 0);
                        Pixel p2 = new Pixel(0,0, 0);
                        Pixel p3 =  new Pixel(0,0, 0);
                        if(x == 0)
                        {
                            p1 = image.getPixel(x+1,y);
                            p3 = new Pixel((p1.getRed()+p.getRed())/2, (p1.getGreen()+p.getGreen())/2, (p1.getBlue()+p.getBlue())/2);
                        }
                        else if(x==width1-1)
                        {
                            p1 = image.getPixel(x-1,y);
                            p3 = new Pixel((p1.getRed()+p.getRed())/2, (p1.getGreen()+p.getGreen())/2, (p1.getBlue()+p.getBlue())/2);
                        }
                        else
                        {
                            p1 = image.getPixel(x+1,y);
                            p2 =  image.getPixel(x-1 , y);
                            p3 = new Pixel((p1.getRed()+p2.getRed()+p.getRed())/3, (p1.getGreen()+p2.getGreen()+p.getGreen())/3, (p1.getBlue()+p2.getBlue()+p.getBlue())/3);
                        }
                        newimage.setPixel(x * enlargefactor + z, y * enlargefactor + s, p3);

                    }
                }
            }
        }
        newimage.draw();
    }

}
