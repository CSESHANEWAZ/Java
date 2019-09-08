
package array;

import java.util.Scanner;


public class SmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter any integer number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element is: "+min );
    }
}
