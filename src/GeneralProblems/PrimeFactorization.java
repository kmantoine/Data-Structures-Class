package GeneralProblems;

//Have the user enter a number and find all Prime Factors (if there are any) and display them.

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class PrimeFactorization {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Please enter an integer number: ");
        int num=input.nextInt ();
        primeFactors(num);
    }

    public static void primeFactors(int num) {
        while (num%2==0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i+= 2) {
            while (num%i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 2)
            System.out.println(num);
    }

}
