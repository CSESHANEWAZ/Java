
package array;

import java.util.Scanner;

public class print_the_duplicate_elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Print duplicate element in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
            
        }
        System.out.println("");
    }
    
}
