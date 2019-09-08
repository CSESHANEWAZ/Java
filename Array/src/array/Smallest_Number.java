
package array;

import java.util.Scanner;


public class Smallest_Number {
    public static int getSmallestNumber(int[] arr,int total){
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
        return arr[0];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter any integer number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Smallest Number is: "+getSmallestNumber(arr,arr.length));
    }
 
}
