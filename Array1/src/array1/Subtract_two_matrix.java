
package array1;

import java.util.Scanner;

public class Subtract_two_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];
        System.out.println("Enter inputs in matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter inputs in matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = input.nextInt();
            }
        }
         System.out.println("Output: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] - arr2[i][j];  
                 System.out.print(arr3[i][j]+" ");
                 
            }
            System.out.println();
        }
        System.out.println();
       
       
        
    }
}
