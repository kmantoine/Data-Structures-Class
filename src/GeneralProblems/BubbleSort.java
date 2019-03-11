package GeneralProblems;
/**
 *
 * @author Kerwan Miguel Antoine
 */

//Implement two types of sorting algorithms: Merge sort and bubble sort

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100); //Fill array randomly
            System.out.print (numbers[i] + ", ");
        }
        System.out.println ();
        int [] sorted = bubbleSort (numbers);         //Sort array using bubble sort
        for (int i = 0; i < sorted.length; i++) {     //Print the sorted array
            System.out.print (sorted[i] + ", ");
        }
    }

    static int[] bubbleSort (int[]array){
        int temp;
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array [j] > array [j+1]) {
                    temp = array [j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                }
            }
        }
        return array;
    }

}