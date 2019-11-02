import java.io.*;
import java.util.ArrayList;

public final class DuplicateCounter {
	 // instance variables - replace the example below with your own
    private static ArrayList<String> uniqueWords = new ArrayList<String>();
    private static ArrayList<Integer> wordCounter = new ArrayList<Integer>();
   
    /**
     * Constructor for objects of class DuplicateRemover
     */
    public DuplicateCounter()
    {
        // initialise instance variables
        uniqueWords.clear();
        wordCounter.clear();
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public static ArrayList<String> count (String dataFile) throws IOException
    {
        // Open dataFile
        File file = new File(dataFile);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader (input);
       
        String line;
       
        // Init counters
        int word_count = 0,
            duplicateFound=0,
            index;
       
        while ((line = reader.readLine()) != null)
        {
            if (!(line.equals("")))
            {
                String[] wordList = line.split("[ !?.]+");
                word_count += wordList.length;
               
                // for each word in word list
                for (int i=0; i<wordList.length; i++)
                {
                     // Compare each word in wordList
                     // to every word in unique words
                    if (wordList[i] != null)
                    {
                        index = uniqueWords.indexOf(wordList[i].toLowerCase());
                        if (index == -1)
                        {
                            // Add to uniqueList
                            uniqueWords.add(wordList[i].toLowerCase());
                            wordCounter.add(1);
                        } else {
                            // Count how many times it appears
                            wordCounter.set(index, wordCounter.get(index)+1);      
                        } // end if
                    } // end if
                } // end for
               
                // If word from from word list is not in unique words
                // Add word to unique word
               
                // For each word in dataFile, print it out to show it works
                //for (int i=0; i<uniqueWords.size(); i++)
                //   System.out.println("Word[" + i+"]: " + uniqueWords.get(i) + " (" + wordCounter.get(i) + ")");
            } // end if
        }
       
        System.out.println("Word Count = " + word_count);
     
       
        return (uniqueWords);
    }
   
    public static void write (String outputFile) throws IOException
    {
        // Define objects
        BufferedWriter output = null;
       
        // Open up outputFile, overwrite
        File file = new File(outputFile);
        output = new BufferedWriter(new FileWriter(file));
       
        // Write uniqueWords to outputFile
        for (int i=0; i<uniqueWords.size(); i++)
        {
            output.write(uniqueWords.get(i));
            output.write(" (" + wordCounter.get(i) + ")");
            output.newLine();
        }
         
        output.close();
    }
}
