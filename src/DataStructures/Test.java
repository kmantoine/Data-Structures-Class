package DataStructures;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class Test {

    public static void main(String[] args) {
        int[][] a = new int [3][3];
        int temp=0;
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                a[i][j]=j;
                temp = temp + a[i][j];
            }
            System.out.println(temp);

        }
    }
    
}
