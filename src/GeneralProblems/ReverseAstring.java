package GeneralProblems;

//Enter a string and the program will reverse it and print it out

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class ReverseAstring {

public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print ("Please enter a String: ");
    String txt = input.nextLine ();
    char[] text = txt.toCharArray ();
    int length=text.length-1;

    for (int i=0; i<length; i++) {
        char temp;
        temp=text[i];
        text[i]=text[length];
        text[length]=temp;
        length--;
    }

    txt=String.copyValueOf (text);
    System.out.println (txt);
}

}
