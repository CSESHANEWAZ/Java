
package ifelseif;

import java.util.Scanner;


public class IfElseIf {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks: ");
        marks = input.nextInt();
        
        if(marks >= 97 && marks <= 100){
            System.out.println("A+");
        }
        
        else if(marks >= 90 && marks <= 96){
            System.out.println("A");
        }
        
        else if(marks >= 87 && marks <= 89){
            System.out.println("A-");
        }
        
        else if(marks >= 83 && marks <= 86){
            System.out.println("B+");
        }
        
        else if(marks >= 80 && marks <= 82){
            System.out.println("B");
        }
        
        else if(marks >= 77 && marks <= 79){
            System.out.println("B-");
        }
        
        else if(marks >= 73 && marks <= 76){
            System.out.println("C+");
        }
        
        else if(marks >= 70 && marks <= 72){
            System.out.println("C");
        }
        
        else  if(marks >= 67 && marks <= 69){
            System.out.println("C-");
        }
        
        else  if(marks >= 63 && marks <= 66){
            System.out.println("D+");
        }
        
        else if(marks >= 60 && marks <= 62){
            System.out.println("D");
        }
        
        else{
            System.out.println("F");
        }
        
    }
        
    
    
}
