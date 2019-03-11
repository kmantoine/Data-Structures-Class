package DataStructures;
/**
 *
 * @author Kerwan Antoine
 */
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum=0, count=0;
        double average;
        System.out.println ("Enter 10 Integers");
        int [] nums = new int [10];
        for (int i=0; i<nums.length; i++) { //Fill array
            System.out.print ("\nNumber: ");
            nums[i] = keyboard.nextInt();
        }
        for (int i=0; i<nums.length; i++) { //logic
            if (nums[i] % 2 == 0) {
                sum+=nums[i];
                count+=1;
            }
        }   
        average = sum/count;
        System.out.println ("The average of all the even numbers is " + average);
    }
}