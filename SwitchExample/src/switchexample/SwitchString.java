
package switchexample;

import java.util.Scanner;


public class SwitchString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String levelString;
        System.out.print("Enter any String: ");
        
        levelString = input.nextLine();
        
        switch(levelString){
            case "B.Sci" : 
                System.out.println("CGPA is: 3.50");
                break;
            
            case "HSC" :
                System.out.println("GPA is: 3.80");
                break;
            
            case "SSC" :
                System.out.println("GPA is: 4.75");
                break;
                
            case "JSC" :
                System.out.println("GPA is: 4.00");
                break;
            default :
                System.out.println("your level is Zero");
        }
        
    }
    
}
