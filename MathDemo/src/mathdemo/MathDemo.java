
package mathdemo;

import java.util.Scanner;


public class MathDemo {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.print("Enter any value: ");
        x = input.nextInt();
        System.out.print("Enter any value: ");
        y =  input.nextInt();
        
        int result = Math.max(x, y);
        System.out.println("The max value is: "+result);
        
        
        int result1 = Math.min(x, y);
        System.out.println("The min value is: "+result1);
        
        int absulate = Math.abs(y);
        System.out.println("The abs value of  is: "+absulate);
        
        double power = Math.pow(x,y);
        System.out.println("x to the power y: "+power);
        
        int round = Math.round(8.5f);
        System.out.println("Round of 8.5 is: "+round);
        
        double pi = Math.PI;
        System.out.println("Pi is: "+pi);
        
        
        
        
        
        
    }
    
}
