// BlueJ Project: lesson4/book7
// Video: Working with the Book Text
import java.util.Scanner;
import java.io.File;
public class Book2
{
    private String bookText;

    public Book2(String fileName)
    {
        readBook(fileName);
    }
}
public class LookUpAnyWord
{


    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
       
        // TODO: Create an scanner object to read the user input
        // Read a word from the scanner and assign it to a String variable named word
        Scanner in = new Scanner(System.in);
        String word = in.next();

        // TODO: Create a book object that reads from aliceInWonderland.txt

        int length = bookText.length();
        int lengthWithoutWord = bookText.replace(word, "").length();
        return (length - lengthWithoutWord) / word.length();

        // TODO: Find the number of occurences of that word and assign it to a variable named occurences
        System.out.println(word + " occurs " + occurrences + " times!");
    }

}   
