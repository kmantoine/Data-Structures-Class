package GeneralProblems;

//Asks the user to enter a cost and either a country or state tax. It then returns the tax plus the total cost with tax.

import java.util.Scanner;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class TaxCalculator {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String again;
        do {
            System.out.print("Enter the item's cost: ");
            double cost = input.nextDouble();
            System.out.print("\nEnter the required tax rate: ");
            double taxRate = input.nextDouble();
            if (cost!=0 && taxRate!=0){
                double tax = cost * taxRate/100;
                double totalCost = cost+tax;
                System.out.printf ("\n\nThe Total Cost of the item is $ %.2f",totalCost);
                System.out.printf (", including a tax of $ %.2f" ,tax);
            }

            System.out.print("\nRepeat? Hit 'y' to go again: "); //Loop
            again = input.next ().toUpperCase ();
        } while (again.equals ("Y") );
    }

}
