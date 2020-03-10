import images.*;
import java.util.Scanner;
public class P5H
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Name of photo to edit?");
        String filename = in.nextLine();
        System.out.print("Shrinkage factor?");
        int shrinkage = in.nextInt();
        APImage image = new APImage(filename);
        int width1 = image.getImageWidth();
        int height1 = image.getImageHeight();
        APImage newimage = new APImage(width1 / shrinkage, height1 / shrinkage);
        for (int x  = 0; x < width1 - shrinkage; x += shrinkage)
        {
            for (int y = 0; y < height1 - shrinkage; y += shrinkage)
            {
                Pixel p = image.getPixel(x,y);
                newimage.setPixel(x / shrinkage, y / shrinkage, p);
            }
        }
        newimage.draw();
        }

    }
