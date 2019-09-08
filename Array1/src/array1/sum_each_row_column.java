
package array1;

import java.util.Scanner;


public class sum_each_row_column {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[][] = new int[3][3];
       
        
        System.out.println("Enter inputs in matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = input.nextInt();
            }
           
        }
        
         System.out.println("Output: ");
        for (int i = 0; i < 3; i++) {
            int sumRow =0;
            for (int j = 0; j < 3; j++) {
              sumRow = sumRow +arr1[i][j];    
            }
             System.out.println("Sum of "+(i+1)+"row: "+sumRow);
        }
        for (int i = 0; i < 3; i++) {
            int sumColumn =0;
            for (int j = 0; j < 3; j++) {
              sumColumn = sumColumn +arr1[j][i];    
            }
             System.out.println("Sum of "+(i+1)+"row: "+sumColumn);
        }
       
       
       
        
    } 
}
