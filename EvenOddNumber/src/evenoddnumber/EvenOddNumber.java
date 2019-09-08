
package evenoddnumber;

import java.util.Scanner;


public class EvenOddNumber {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number: ");
        int m = input.nextInt();
        System.out.print("Enter final number: ");
        int n = input.nextInt();
        int sum1 = 0,sum2 = 0;
        
        for (int i = m; i <= n; i++) {
            if(i % 2 == 0){              //// even number enter
                sum1 = sum1 + i;
                
            }
            else{
                sum2 = sum2 + i;
                
               
            }
            
        }
        
        System.out.println("Sum of Even Number is: "+sum1);
        System.out.println("Sum of odd Number is: "+sum2);
        
        
    }
    
}
