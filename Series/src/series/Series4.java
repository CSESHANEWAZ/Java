
package series;

import java.util.Scanner;


public class Series4 {
    
      public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double n,sum= 0;
        System.out.print("Enter the last number = ");
        n = input.nextDouble();
        
        for(double i = 1.5;i<= n;i++){        ///1.5+2.5+3.5+....+n
            
            sum = sum + i;
            System.out.print(i+ " + ");
        }
        System.out.println("");
        System.out.println("sum of the series is = "+sum);
    }
    
}
