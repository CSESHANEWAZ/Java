
package reversenumber;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,temp,x;
        System.out.print("Enter any Number: ");
        num = input.nextInt();
        temp = num;
        
        while(temp != 0){
            x = temp % 10;
            sum = sum * 10 + x ;
            temp = temp / 10 ;
            
        }
        System.out.println("Reverse of the input number is: "+sum);
        
    }
    
}
