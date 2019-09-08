
package array1;

import java.util.Scanner;


public class Multiple_two_matrixs {
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
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                   arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];  
                 
                }
                
                 
            }
            
        }
        System.out.println("output: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print(arr3[i][j]+" ");  
            }
            System.out.println();
        }
       
       
        
    }
    
}
