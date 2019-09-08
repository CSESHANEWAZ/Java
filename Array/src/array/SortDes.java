
package array;

import java.util.Scanner;


public class SortDes {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter any integer number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i] < arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               } 
            }
        }
        System.out.println("");
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
         System.out.println("");    
    }
}
