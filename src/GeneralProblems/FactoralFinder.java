package GeneralProblems;

//The factorial of a positive integer, n, is defined as the product of the sequence n, n-1, n-2, ... 1 and the factorial of zero, 0, is defined as being 1. Solve this using both loops and recursion

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class FactoralFinder {

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String again;
        do {
            int factorialLoop = 1;
            int factorialRecursion;

            System.out.print ("Please enter a positive integer: ");
            int num = input.nextInt ();

            for(int i=1; i<=num; i++){            //Using a Loop
                factorialLoop*=i;
            }
            factorialRecursion = factorial (num); //Using Recursion

            System.out.println("\nThe factorial of " + num + " using a loop is: " + factorialLoop + " and using recursion is " + factorialRecursion + "\n");
            System.out.print("\n\nRepeat? Hit 'y' to go again: ");
            again = input.next ().toUpperCase ();
        } while ("Y".equals (again)) ;

    }

    public static int factorial (int num){
        while (num > 0)
            return(num* factorial(num-1));
        return 1;
    }

}
