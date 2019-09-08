
package ifelse;

import java.util.Scanner;


public class IfElse {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any value: ");
        num = input.nextInt();
        
        if(num > 0)
        {
            System.out.println("Positive number.");
        }
        else if(num < 0)
        {
            System.out.println("Negative number.");
        }
        else
        {
           System.out.println("Number is equal to zero."); 
        }
       
    }
    
}
