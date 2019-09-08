
package array;

import java.util.Scanner;


public class ThirdLargestNumber {
    public static int getThirdLargest(int[] arr, int total){
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
        return arr[total - 3];
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter any interger number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
       // int arr[] = {1,2,5,6,3,2};
        System.out.println("Third Largest: "+getThirdLargest(arr,arr.length));
           
    }
}
