
package pattern;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = input.nextInt();
        
        System.out.println(".....output.....");
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
        
    }
           
}
