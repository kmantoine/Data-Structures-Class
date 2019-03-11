package GeneralProblems;

// A happy number is defined by the following process. Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
// or it loops endlessly in a cylce which does not  include 1. Those numbers for which the process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers. Display an example of your output here.
// Find the first 8 happy numbers.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class HappyNumbers {

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String again;
        do {
            System.out.print ("Please enter a positive integer: ");
            int num = input.nextInt ();
            if (happyNumber(num))
                System.out.println ("Happy Number");
            else
                System.out.println ("Unhappy Number");

            System.out.print("\n\nRepeat? Hit 'y' to go again: ");
            again = input.next ().toUpperCase ();
        } while ("Y".equals (again)) ;
    }

    public static boolean happyNumber (int num){
        Set<Integer> check = new HashSet<>();
        while (check.add (num)) {
            int value = 0;
            while (num > 0) {
                value += Math.pow (num % 10, 2);
                num /= 10;
            }
            num = value;
        }
        return num == 1;
    }

}
