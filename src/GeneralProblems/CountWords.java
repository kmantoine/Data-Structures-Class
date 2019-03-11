package GeneralProblems;

//Counts the number of individual words in a string. For added complexity read these strings from a text file and generate a summary.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class CountWords {

public static void main (String[] args) {
    File inputFile = new File("Welcome File.txt");
    try {
        Scanner reader = new Scanner(new FileInputStream(inputFile));
        int words=0;
        while(reader.hasNext()){
            words++;
            reader.next();
        }
        System.out.println("There are " + words + " words.");
    }
    catch (FileNotFoundException ex) {
        Logger.getLogger (CountWords.class.getName()).log (Level.SEVERE, "Error reading file", ex);
    }

}

}
