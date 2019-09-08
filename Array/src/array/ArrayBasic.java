
package array;

import java.util.Scanner;


public class ArrayBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] Array = new int[5];
        
        System.out.println("Enter any number: ");
        for (int i = 0; i < Array.length; i++) {
            Array [i] = input.nextInt();
            sum = sum + Array[i];
        }
        double avg = sum / Array.length;
        
        int max = Array[0];
         int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if(Array[i] > max)
                max = Array[i];
            if(Array[i] < min)
                min = Array[i];
        }
        
       
       
        
        System.out.println("Sum of the number is: "+sum);
        System.out.println("Average is: "+avg);
        System.out.println("Maxinum Number is: "+max);
        System.out.println("Mininum Number is: "+min);
    }
    
}
