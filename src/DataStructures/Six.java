package DataStructures;
/**
 *
 * @author Kerwan Antoine
 */
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print ("Enter a number: ");
        double num = keyboard.nextDouble();
        
        if (num%2!=0)
            System.out.println (num + " Is a prime number ");
        
    }
}


