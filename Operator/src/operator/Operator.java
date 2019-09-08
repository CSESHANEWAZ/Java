
package operator;

//import static java.time.Clock.system;
import java.util.Scanner;


public class Operator {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2,result1,result2,result3;
        
        
        System.out.print("Enter any number: ");
        num1 = input.nextInt();
        
        System.out.print("Eneter any number: ");
        num2 = input.nextInt();  
        
        result1 = num1 + num2;
        result2 = num1 - num2;
        result3 = num1 * num2;
        double result4 = (double)num1 / num2;
        
        System.out.println("Add: "+result1);
        System.out.println("Sub: "+result2);
        System.out.println("Mult: "+result3);
        System.out.println("Div: "+result4);
        
    }
    
}
