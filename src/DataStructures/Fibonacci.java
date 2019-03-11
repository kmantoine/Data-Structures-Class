package DataStructures;

/**
 *
 * @author Miguel & Niana
 */
public class Fibonacci {
        
    static void printFibonacci(int count, int n1, int n2, int n3){    
        if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print("\t" + n3);   
            printFibonacci(count-1, n1, n2, n3);    
        }    
    } 
    
    public static void main(String args[]){    
        int count=20, n1=0, n2=1, n3=0; 
        System.out.print(n1 + "\t" + n2);   
        printFibonacci(count-2, n1, n2, n3);  
        System.out.println();
    }
 
}  