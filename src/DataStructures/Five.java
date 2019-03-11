package DataStructures;
/**
 *
 * @author Kerwan Antoine
 */
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println ("Enter 10 Integers");
        int[] A = new int [5];
        int[] B = new int [5];
        int even=0, odd=0;
       
        for (int i=0; i<10; i++) {
            System.out.print ("\nNumber: ");
            int num = keyboard.nextInt();
            if (num%2==0) 
                A[even++] = num;
            else
                B[odd++] = num;
        }       
        System.out.println ("\nA\tB");
        for (int i=0; i<5; i++)
            System.out.println (A[i] + "\t" + B[i] + "\n");   
    }
}


