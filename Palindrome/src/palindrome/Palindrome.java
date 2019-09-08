
package palindrome;

import java.util.Scanner;


public class Palindrome {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,a,temp = 0;
        System.out.print("Enter sum of digit: ");
        num = input.nextInt();
        int b = num;
        
        while(num > 0){
            
            a = num % 10;
            num = num / 10;
            temp = temp * 10 + a;
        }
        if (temp == b){
            System.out.println("Palindrome.");
        }
        
        else{
            System.out.println("Not Palindrome.");
        }
    }
    
}
