import images.APImage;
import images.Pixel;
public class P5Ftest
{
    public static void main(String[] args)
    {
        APImage west_puzzle = new APImage("west-puzzle.png");
        for(Pixel p : west_puzzle)
        {
            int blueval = p.getBlue();
            p.setRed(0);
            p.setGreen(0);
            if(blueval > 15){
            p.setBlue(0);}
            else
                {
                    p.setBlue(0);
                    p.setRed(blueval * 16);
                }
        }
        west_puzzle.draw();
    }
}
