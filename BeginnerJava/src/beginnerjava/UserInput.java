
package beginnerjava;

import java.util.Scanner;


public class UserInput {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double Marks;
        String Name;
        int phone_no;
        
        System.out.print("Enter your name: ");
        Name = input.nextLine();
        
        System.out.print("Enter your marks: ");
        Marks = input.nextInt();
        
        System.out.print("Enter your phone number: ");
        phone_no = input.nextInt();
        
        System.out.print("\n");
        System.out.println("..........output.............");
        System.out.println("Name= "+Name);
        System.out.println("Marks= "+Marks);
        System.out.println("Phone_no= "+phone_no);
    }
          
    
}