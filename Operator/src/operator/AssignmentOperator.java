
package operator;

import java.util.Scanner;



public class AssignmentOperator {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int num1,num2;
    System.out.print("Enter any number: ");
    num1 = input.nextInt();
    
    System.out.print("Enter any number: ");
    num2 = input.nextInt();
    
    num1 += num2;
      System.out.println("Output: "+num1);
    num1 -= num2;
     System.out.println("Output: "+num1);
    num1 *= num2;
     System.out.println("Output: "+num1);
    num1 /= num2;
       System.out.println("Output: "+num1);
    num1 %= num2;
     System.out.println("Output: "+num1);
   
  
   
   
 
   
    }
    
}
