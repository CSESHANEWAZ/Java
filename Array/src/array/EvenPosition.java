
package array;

import java.util.Scanner;


public class EvenPosition {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Elements of given array present on even position: ");  
        for (int i = 1; i < arr.length; i=i+2) {
            System.out.println(arr[i]+" ");
        }
    }
         
}
