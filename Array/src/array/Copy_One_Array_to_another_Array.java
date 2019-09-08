
package array;

import java.util.Scanner;


public class Copy_One_Array_to_another_Array {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] Array1 = new int[5];
    int[] Array2 = new int[5];
    
    System.out.print("Enter any number: ");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = input.nextInt();
            Array2[i] = Array1[i];
            
        }
        System.out.print("Array2 = ");
        for (int i = 0; i < Array2.length; i++) {
            System.out.print(Array2[i]+" ");
            
        }
    }
 
    
}
