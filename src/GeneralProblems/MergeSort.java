package GeneralProblems;

/**
 *
 * @author Kerwan Miguel Antoine
 */

//Implement two types of sorting algorithms: Merge sort and bubble sort
public class MergeSort {
    public static void main(String args[]) {
        int[] numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100); //Fill array randomly
            System.out.print (numbers[i] + "\t");
        }

        sortArrays (numbers, 0, numbers.length-1);     //Sort array using merge sort
        System.out.println ("\n\n");
        for (int i = 0; i < numbers.length; i++) {     //Print the sorted array
            System.out.print (numbers[i] + "\t");
        }
        System.out.println ("\n");
    }

    public static void sortArrays (int numbers[], int A, int B) {
        if (A < B) {
            int mid = (A+B)/2;  //Find the middle
            sortArrays (numbers, A, mid);    //Sort first half
            sortArrays (numbers, mid+1, B); //Sort second half
            mergeArrays (numbers, A, mid, B); //Merge the two
        }
    }

    public static void mergeArrays (int numbers[], int A, int mid, int B) {
        int size1 = mid - A + 1;
        int size2 = B - mid;

        //Create new Arrays & insert data
        int side1[] = new int [size1];
        int side2[] = new int [size2];
        for (int i=0; i<size1; ++i)
            side1[i] = numbers [A+i];
        for (int j=0; j<size2; ++j)
            side2[j] = numbers [mid+1+j];

        int i = 0, j = 0, k = A;

        while (i < size1 && j < size2) {
            if (side1[i] <= side2[j]) {
                numbers[k] = side1[i];
                i++;
            }
            else {
                numbers[k] = side2[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            numbers[k] = side1[i];
            i++;
            k++;
        }
        while (j < size2) {
            numbers[k] = side2[j];
            j++;
            k++;
        }
    }

}
