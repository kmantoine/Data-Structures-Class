package GeneralProblems;

//Develop a converter to convert a decimal number to binary or a binary number to its decimal equivalent

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class BinaryConverter {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = input.nextInt();
        int decimalNum=0;
        int exp=0;

        while(num>0) {
            decimalNum+=((num%10) * Math.pow (2,exp));
            num/=10;
            exp++;
        }


        System.out.println(decimalNum);
    }

}
