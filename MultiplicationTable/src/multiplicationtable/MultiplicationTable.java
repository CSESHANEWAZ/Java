
package multiplicationtable;

import java.util.Scanner;


public class MultiplicationTable {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum = 0 ;
        System.out.print("Enter any number: ");
        n = input.nextInt();
            
        
        for (int i = 1; i <= 10; i++) {
            sum = n * i;
            System.out.println(n+" X "+i + " = "+sum);
            
        }
        
    }
    
}
