import java.io.*;
import java.util.ArrayList;

public final class DuplicateRemover {
	 // instance variables - replace the example below with your own
    private static ArrayList<String> uniqueWords = new ArrayList<String>();
   
    /**
     * Constructor for objects of class DuplicateRemover
     */
    public DuplicateRemover()
    {
        // initialise instance variables
        uniqueWords.clear();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public static ArrayList<String> remove (String dataFile) throws IOException
    {
        // Open dataFile
        File file = new File(dataFile);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader (input);
       
        String line;
       
        // Init counters
        int word_count = 0,
            duplicateFound=0;
       
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
                           if (uniqueWords.indexOf(wordList[i].toLowerCase()) == -1)
                            {
                                // Add to uniqueList
                                uniqueWords.add(wordList[i].toLowerCase());
                            }
                    } // end if
                } // end for
               
                // If word from from word list is not in unique words
                // Add word to unique word
               
               
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
            output.newLine();
        }
         
        output.close();
    }
}
