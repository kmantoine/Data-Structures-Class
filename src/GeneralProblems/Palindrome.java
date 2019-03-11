package GeneralProblems;

//Checks if the string entered by the user is a palindrome. That is that it reads the same forwards as backwards like "racecar".

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class Palindrome {

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Please enter a String: ");
        String txt = input.nextLine ();
        char[] text = txt.toCharArray ();

        boolean palindrome=true;
        int length=text.length-1;
        for (int i=0; i<length; i++) {
            if (text[i]!=text[length])
                palindrome=false;
            length--;
        }

        if (palindrome)
            System.out.println ("String is Palindrome");
        else
            System.out.println ("String is not Palindrome");
    }

}
