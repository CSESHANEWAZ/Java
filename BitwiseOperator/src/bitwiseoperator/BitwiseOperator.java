
package bitwiseoperator;           //Binary Operator

import java.util.Scanner;

public class BitwiseOperator {

  
    public static void main(String[] args) {
      
         Scanner input = new Scanner(System.in);
        int num1, num2, ans;
        System.out.print("Enter any number1: ");
        num1 = input.nextInt();
        System.out.print("Enter any number2: ");
        num2 = input.nextInt();
        
        System.out.println(".....................output.....................");
        
        ans = num1 & num2;                  //if both bits are 1, it gives 1, else it gives 0
        System.out.println("bitwise and of 2 num: "+ans);
        
        ans = num1 | num2;                   // if either of the bits is 1, it gives 1, else it gives 0                             
        System.out.println("bitwise or of 2 num: "+ans);
        
        ans = num1 ^ num2;              //if corresponding bits are different, it gives 1,else it gives 0
        System.out.println("bitwise xor of 2 num: "+ans);
        
        ans = ~ num1;                       // ~ it makes every 0 to 1, and every 1 to 0.
        System.out.println("bitwise Complement of 2 num: "+ans);
        
        ans = num1 << 2;                       // Lift Shift
        System.out.println("bitwise Lift shift: "+ans);
        
        ans = num1 >> 2;                       // Right Shift
        System.out.println("bitwise Right shift: "+ans);
        
        
        
        
        
        
        
    }
    
}
