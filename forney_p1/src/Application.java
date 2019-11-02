import java.io.*;
import java.util.ArrayList;

public class Application {
	// instance variables - replace the example below with your own
    private static ArrayList<String> uniqueWords = new ArrayList<String>();

    /**
     * Constructor for objects of class Application
     */
    public static void main(String[] args) throws IOException
    {
        // initialise instance variables
        DuplicateRemover util = new DuplicateRemover();
       
        // Remove the duplicate words in problem1.txt and
        // return them in an ArrayList of strings called uniqueWords
        uniqueWords = util.remove("problem1.txt");
       
        // Write out uniqueWords to a file named "unique_words.txt"
        util.write("unique_words.txt");
       
        // For each word in dataFile, print it out to show it works
        for (int i=0; i<uniqueWords.size(); i++)
            System.out.println("Word[" + i+"]: " + uniqueWords.get(i));
    }  
}
