package DataStructures;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] A = new int[] {4,8,3,5,1};
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A.length-i-1; j++){
                if (A[j]>A[j+1]) {
                    int swap = A[j];
                    A [j] = A[j+1];
                    A[j+1] = swap;
                }
            }
        }
        for (int i=0; i<A.length; i++){
            System.out.print (A[i] + "\t");
        }
    }
    
}
