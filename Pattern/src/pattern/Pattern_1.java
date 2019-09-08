
package pattern;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = input.nextInt();
        
        System.out.println(".....output.....");
        for (int row = 1; row <= n; row++) {                    
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
}
