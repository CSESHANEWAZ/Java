
package operator;

import java.util.Scanner;


public class UnaryOperator {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x,result;
        
        System.out.print("Enter any value of x: ");
        x = input.nextInt();
        result = +x;
        System.out.println("result = "+result);
        
       // System.out.print("Enter any value of y: ");
       // y=input.nextInt();
        result = -x;
        System.out.println("result = "+result);
        
                     
    }
    
}
