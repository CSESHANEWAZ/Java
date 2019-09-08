
package palindrome;

import java.util.Scanner;


public class Palindrome1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp,r,sum=0;
        System.out.print("Enter any Integer Number: ");
        num = input.nextInt();      ///234     121
        temp =num;
        
        while(temp != 0){
            r = temp % 10;
            sum = sum * 10 + r;   ////reverse version of input number  432       121 
            temp =temp / 10;
        }
        
        if(num == sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
