import java.io.*;
import java.util.ArrayList;

public class Application {
	// instance variables - replace the example below with your own
    private static ArrayList<String> uniqueWords = new ArrayList<String>();
    private int x;

    /**
     * Constructor for objects of class Application
     */
    public static void main(String[] args)throws IOException
    {
        // initialise instance variables
        DuplicateCounter util = new DuplicateCounter();
       
        // Remove the duplicate words in problem1.txt and
        // return them in an ArrayList of strings called uniqueWords
        uniqueWords = util.count("problem2.txt");
       
        // Write out uniqueWords to a file named "unique_words.txt"
        util.write("unique_word_counts.txt");
       
        // For each word in dataFile, print it out to show it works
        for (int i=0; i<uniqueWords.size(); i++)
            System.out.println("Word[" + i+"]: " + uniqueWords.get(i));
    }  
}
