
package array1;

import java.util.Scanner;

public class sparse_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int [3][3];
        System.out.println("Enter any matrix please: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int size = arr.length * arr[0].length;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr[i][j] == 0){
                    count++;
                }
            }
        }
        if(count > size/2){
            System.out.print("Given matrix is sparse matrix.");
        }
        else
            System.out.print("Given matrix is not sparse matrix.");
        System.out.println("");
    }
}
