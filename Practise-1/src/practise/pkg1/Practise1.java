
package practise.pkg1;

import java.util.Scanner;


public class Practise1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String name;
        int id;
        String ver;
        double marks;
        int phone_no;
        
        System.out.print("Enter your Name: ");
        name = input.nextLine();
        System.out.print("Enter your ID: ");
        id = input.nextInt();
       
        System.out.print("Enter your Marks: ");
        marks = input.nextDouble();
       
        System.out.print("Enter your Phone_no: ");
        phone_no = input.nextInt();
       
        
        System.out.println("##########OUTPUT###########");
        
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Marks: "+marks);
     
        System.out.println("Phone no: "+phone_no);
     
                
    }
    
}
