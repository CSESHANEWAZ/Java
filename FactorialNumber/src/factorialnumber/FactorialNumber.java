
package factorialnumber;

import java.util.Scanner;


public class FactorialNumber {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number = ");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(n+" Factorial is "+fact);
       
        
        
    }
    
}
