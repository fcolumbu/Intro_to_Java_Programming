import java.util.Scanner;
public class Sunset
{
   
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        pic.draw();
        final int MAX_RED = 255;
        System.out.print("What red level would you like to add (0 - 255)? ");
        Scanner in = new Scanner(System.in);
        int added_red = in.nextInt();
        added_red = Math.min(MAX_RED, added_red); // Error check
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(added_red);
            pic.setColorAt(i, c);
        }
    }
}
