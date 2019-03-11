package GeneralProblems;

//Start with a number > 1. Find the number of steps it takes to reach one using the following process. If n is even, divide it by 2. If n is odd, multiply it by 3 and add 1.

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class CollatzConjecture {

static int count=0;

public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print ("Please enter an integer greater than One: ");
    int num = input.nextInt ();
    algorithm (num);
    System.out.println (count + " steps!");

}

public static void algorithm (int num) {
    System.out.print(num + "\t");

    if (num == 1) {
        System.out.println ("\n");
    }
    else if (num%2==0) {
        algorithm(num / 2);
        count++;
    }
    else {
        algorithm(num*3+1);
        count++;
    }    
}

}
