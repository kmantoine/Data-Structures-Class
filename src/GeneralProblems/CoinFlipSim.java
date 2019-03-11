package GeneralProblems;

//Write some code that simulates flipping a single coin however many times the user decides. The code should record the outcomes and count the number of tails and heads

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class CoinFlipSim {

    static int head=0;
    static int tail=0;

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random ();
        String again;

        do {
            int flip = random.nextInt(2);
            System.out.print(coin(flip));
            System.out.print("\nRepeat? Hit 'y' to go again: ");
            again = input.next ().toUpperCase ();
        } while ("Y".equals (again)) ;

        System.out.println ("There were " + head + " heads and " + tail + " tails!");
    }

    public static String coin(int face) {
        if (face == 0) {
            head++;
            return "Heads";
        } else {
            tail++;
            return "Tails";
        }
    }

}
