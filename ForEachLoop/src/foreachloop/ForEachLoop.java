
package foreachloop;

import java.util.Scanner;


public class ForEachLoop {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] num = new int[5];
       String[] name = new String[6];
        System.out.print("Enter any integer number: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        for (int x : num) {
            System.out.print(x+" ");
        }
        System.out.println();
        
        for (int i = 0; i < name.length ; i++) {
            name[i] = input.nextLine();
        }
        for(String y : name){
            System.out.print(y+" ");
        }
        System.out.println();
        
    }
    
}
