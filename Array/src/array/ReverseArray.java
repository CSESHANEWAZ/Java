
package array;

import java.util.Scanner;


public class ReverseArray {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
      
        System.out.print("Reverse Array: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
