
package array;

import java.util.Scanner;


public class Find_Second_largest_number {
    public static int getSecondlargest(int[] arr , int total){
         int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i+1; j < total; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total - 2];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new  int[6];
        System.out.print("Enter any integer number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Second largest number: "+getSecondlargest(arr,arr.length));
        
    }
  
}
