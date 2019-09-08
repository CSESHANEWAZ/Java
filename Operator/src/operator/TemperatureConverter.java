
package operator;

import java.util.Scanner;


public class TemperatureConverter {
    
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    float farn,cels,far,cel;
        
        System.out.print("Enter celsius value: ");
        cels= input.nextFloat();
        
       farn = ((9 * cels))/5 +32;
        
        System.out.println("Farenheit = "+farn);
        
        System.out.print("Enter Farenheit value: ");
        far = input.nextFloat();
        
        cel = ((far - 32) * 5) / 9 ;
        
        System.out.println("Celsius = "+cel);
    
    }
    }
    

