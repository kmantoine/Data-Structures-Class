/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;
/**
 *
 * @author Niana & Kerwan
 */
public class Sorting {
    public static void main(String[] args) {
        int[] A = new int[10000];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 1000);
        }
        long starttime = System.currentTimeMillis(); //record time of running method
        int [] B = bubbleSort(A);
        long endtime = System.currentTimeMillis();   //record time of running method
        printNumbers(B);
        System.out.println ("That took " + (endtime-starttime) + " milliseconds\n");
        
        long starttime1 = System.currentTimeMillis();   //record time of running method
        int []C = selectionSort(A);
        long endtime1 = System.currentTimeMillis();     //record time of running method
        printNumbers(C);
        System.out.println ("That took " + (endtime1-starttime1) + " milliseconds\n");
        
        long starttime2 = System.currentTimeMillis();     //record time of running method
        int [] D = insertionSort(A);
        long endtime2 = System.currentTimeMillis();       //record time of running method
        printNumbers(D);
        System.out.println ("That took " + (endtime2-starttime2) + " milliseconds\n");  
    }
   
public static int[] bubbleSort(int[]A){
    int temp;
    for (int i = 0; i < (A.length - 1); i++) {
        for (int j = 0; j < A.length - i - 1; j++) {
            if (A[j] > A[j + 1]) {
                temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
            }
        }
    }
    return A;
}

public static int[] selectionSort(int[]A){
    int pos_min,temp;
    for (int i=0; i < A.length-1; i++){
        pos_min = i;
        for (int j=i+1; j < A.length; j++){
            if (A[j] < A[pos_min])
                pos_min=j;
        }
        if (pos_min != i){
            temp = A[i];
            A[i] = A[pos_min];
            A[pos_min] = temp;
        }
    }
    return A;
}

public static int [] insertionSort(int[]A){
    for(int i = 1; i < A.length; i++){
        int value = A[i];
        int j = i - 1;
        while(j >= 0 && A[j] > value){
            A[j + 1] = A[j];
            j = j - 1;
        }
        A[j + 1] = value;
    }
    return A;
}

private static void printNumbers(int[] array) { 
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + ", ");
    }
    System.out.println("\n");
}
}