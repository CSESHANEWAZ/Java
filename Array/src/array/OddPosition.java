
package array;

import java.util.Scanner;


public class OddPosition {
     public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Elements of given array present on odd position: ");  
        for (int i = 0; i < arr.length; i=i+2) {
            System.out.print(arr[i]+" ");
        }
         System.out.println("");
    }
}
