
package series;

import java.util.Scanner;

public class Series3 {
      public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,sum= 0;
        System.out.print("Enter the last number = ");
        n = input.nextInt();
        
        for(int i = 2;i<= n;i = i+2){       ////2+4+6.........+n
            
            sum = sum + i;
            System.out.print(i+ " + ");
        }
        System.out.println("");
        System.out.println("sum of the series is = "+sum);
    }
    
}
