
package series;

import java.util.Scanner;


public class Series6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last Number = ");
        double n = input.nextDouble();
        double sum = 1.0;
        for (double i = 1.5; i <= n; i++) {     /////1.5 * 2.5 * 3.5* ......*n
            sum = sum * i;
            System.out.print(i+ " * " );
            
        }
        System.out.println("");
        System.out.println("Multiplecation of the number is = "+sum);
        
    }
    
}
