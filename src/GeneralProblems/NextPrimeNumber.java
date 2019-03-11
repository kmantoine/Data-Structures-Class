package GeneralProblems;

//Have the program find prime numbers until the user chooses to stop asking for the next one.

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class NextPrimeNumber {

public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    String again;
    int number=9;

    do {
        int count=0;
        for (int i=2; i<=number/2; i++) {
            if (number%i==0) {
                count++;
            }
        }
        if (count==0) {
            System.out.print(number);
            System.out.print("\nRepeat? Hit 'y' to go again: ");
            again = input.next ().toUpperCase ();
        }
        else
            again="Y";
        number++;
        
    }
    while (again.equals ("Y") );
}

}
