
package nestedif;

import java.util.Scanner;


public class NestedIf {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        double weight;
        System.out.print("Enter your age: ");
        age =input.nextInt();
         System.out.print("Enter your weight: ");
         weight =input.nextDouble();
         
         if(age >= 18){
             if(weight > 50){
                 System.out.println("You can donate blood.");
             }
             else
             {
               System.out.println("You can't donate blood.");  
             }
         }
         
         else 
         {
          System.out.println("You age must be grater than 18.");   
         }
        
    }
    
}
