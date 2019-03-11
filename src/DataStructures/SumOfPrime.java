package DataStructures;

/**
 *
 * @author Kerwan Miguel Antoine & Niana Celestine
 * 
 * WRITE A PROGRAM TO GENERATE 10,000 RANDOM NUMBERS AND FIND THE SUM OF THE PRIME NUMBERS
 */

public class SumOfPrime {

    public static void main(String[] args) {
        int sum=0, num;
        
        for (int i=1; i<=10000; i++) {
            num = (int) (Math.random()*10000);
            int count=0;
            for (int j=2; j<=num/2; j++)
                if (num%j==0)
                    count++;
            if (count==0) {
                System.out.println(num);
                sum+=num;
            }
        }
        System.out.println("The sum of all the prime numbers are: " + sum);
    }
    
}