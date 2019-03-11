package GeneralProblems;

//Enter a string and the program counts the number of vowels in the text. For added complexity have it report a sum of each vowel found.

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */

public class CountVowels {

public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print ("Please enter a String: ");
    String text = input.nextLine ();
    int numOfA = 0;
    int numOfE = 0;
    int numOfI = 0;
    int numOfO = 0;
    int numOfU = 0;

    for (int i=0; i<text.length (); i++) {
        char vowel = text.charAt (i);
        switch (vowel) {
            case 'A' | 'a': numOfA++;
                break;
            case 'E' |'e': numOfE++;
                break;
            case 'I' | 'i': numOfI++;
                break;
            case 'O' | 'o': numOfO++;
                break;
            case 'U' | 'u': numOfU++;
                break;
        }
    }

    int total = numOfA+numOfE+numOfI+numOfO+numOfU;
    System.out.print ("There were " + total + " vowels");
    System.out.println ();
    System.out.println ("There were " + numOfA + " A's, ");
    System.out.println (numOfE + " E's");
    System.out.println (numOfI + " I's");
    System.out.println (numOfO + " O's");
    System.out.println ("and " + numOfU + " U's");



}

}
