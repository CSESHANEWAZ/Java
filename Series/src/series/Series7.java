
package series;

import java.util.Scanner;


public class Series7 {
    
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the last number = ");
           int n = input.nextInt();
           int sum =1;
           for (int i = 1; i <= n; i++) {   ////1^2 * 2^2 * 3^2*......*n^2
               sum = sum * i * i;
               System.out.print(i+"^2 * ");
            
        }
           System.out.println("");
           System.out.println("Multiplecation of the number is = "+sum);
    }
    
}
