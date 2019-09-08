
package primenumber;

import java.util.Scanner;


public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  m,n,i,count,numofprime = 0;
       
        System.out.print("Enter initial number: ");
        m = input.nextInt();
        System.out.print("Enter final number: ");
        n = input.nextInt();
        
        System.out.println("..........output...........");
        System.out.println("Prime Number: ");
        
        for (i = m; i <= n; i++) {
            count = 0;
            for ( int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                    
                }
                
            }
            if (count == 0) {
                numofprime++;
                System.out.print(i+" ");
                
                
            }
           
   
            
        }
        System.out.println("");
         System.out.println("Number of prime is: "+numofprime);

          
         
        }
}
