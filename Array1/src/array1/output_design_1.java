
package array1;

import java.util.Scanner;


public class output_design_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int [3][3];
        System.out.println("Enter any array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.println("OutPut: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
