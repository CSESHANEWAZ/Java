
package array1;

import java.util.Scanner;


public class Add_two_matrixs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[][] = new int[5][5];
        int arr2[][] = new int[5][5];
        int arr3[][] = new int[5][5];
        System.out.println("Enter inputs in matrix1: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter inputs in matrix2: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = input.nextInt();
            }
        }
         System.out.println("Output: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];  
                 System.out.print(arr3[i][j]+" ");
                 
            }
            System.out.println();
        }
        System.out.println();
       
       
        
    }
    
}
