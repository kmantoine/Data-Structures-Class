package DataStructures;
/**
 *
 * @author Kerwan Antoine
 */
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum=0;
        System.out.println ("Enter 10 Integers");
        int [] nums = new int [10];
        
        for (int i=0; i<nums.length; i++) {
            System.out.print ("\nNumber: ");
            nums[i] = keyboard.nextInt();
            sum+=nums[i];
        }
        System.out.println ("The sum of all the numbers is " + sum);
    }
}