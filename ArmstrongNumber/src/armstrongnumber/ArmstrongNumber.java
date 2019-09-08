
package armstrongnumber;

import java.util.Scanner;


public class ArmstrongNumber {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num,temp,r,sum =0;
        System.out.print("Enter any integer number: ");
        num = input.nextInt();
        temp = num;       
        while(temp != 0){
            r = temp % 10;
            sum = sum + (r * r * r);
            temp = temp / 10;
        }
        System.out.println("output value is: "+sum);
        if(sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
    
}
