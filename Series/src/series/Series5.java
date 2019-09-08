
package series;

import java.util.Scanner;


public class Series5 {
      public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,sum= 0;
        System.out.print("Enter the last number = ");
        n = input.nextInt();
        
        for(int i = 1;i<= n;i++){   ////1^1 + 2^2 + 3^3 + 4^4 + 5^5+.....+n^2
            
            sum = sum + i*i;
            System.out.print(i+"^"+i);
            System.out.print(" + ");
        }
        System.out.println("");
        System.out.println("sum of the series is = "+sum);
    }
    
}
