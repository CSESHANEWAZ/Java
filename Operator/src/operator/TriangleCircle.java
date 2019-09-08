
package operator;

import java.util.Scanner;


public class TriangleCircle {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        double hight, base,triangle,circle,rad;
        
        System.out.print("Enter base value: ");
        base = input.nextDouble();
        
        System.out.print("Enter hight value: ");
        hight = input.nextDouble();
        
        System.out.print("Enter radius value: ");
        rad = input.nextDouble();
        
        triangle = 0.5*base*hight;
        
        circle = 3.1416 * rad *rad;
        
        System.out.println("area of triangle is = "+triangle);
        System.out.println("area of circle is = "+circle);
         
        
        
    }
    }
    

