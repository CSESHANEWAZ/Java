
package factorialnumber;

import java.util.Scanner;


public class FactorialNumberRecursion {
    
    static int Factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        
        else
          return   n * Factorial(n-1);
            
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number = ");
        int n = input.nextInt();
        int fact;
        fact = Factorial(n);
         System.out.println(n+" Factorial is "+fact);
    }
}
