
package checkingvowelconsonant;

import java.util.Scanner;


public class CheckingVowelConsonant {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("given charater is an vowel");
        }
        
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
             System.out.println("given charater is an vowel");
        }
        else{
            System.out.println("given character is a consonant");
        }
    }
    
}
