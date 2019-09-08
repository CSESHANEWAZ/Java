
package sumnumber;

import java.util.Scanner;


public class SumNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,sum = 0;
        System.out.print("Enter initial number: ");
        m = input.nextInt();
        System.out.print("Enter final number: ");
        n = input.nextInt();
        for (int j = m ; j <= n ; j++) {
            sum = sum + j;
            
        }
        System.out.println("The sum is: "+sum);
    }
    
    
}

   
   
       
    
 
