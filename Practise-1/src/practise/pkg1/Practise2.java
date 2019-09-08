/////prime number
package practise.pkg1;

import java.util.Scanner;


public class Practise2 {
    


   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,m,n,numofprime = 0;
        
        System.out.println("Enter initial number: ");
        m = input.nextInt();
        
        System.out.println("Enter final number: ");
        n = input.nextInt();
        
        System.out.println("..............output........");
        
        for (i = m; i <= n ;i++ ){
            int count = 0;
            for (j = 2;j < i ;j++ ){
                if(i % j == 0){
                    count++;
                    break;
                }
               
                }
             if(count == 0){
                    numofprime++;
                    System.out.print(i+" ");
            } 
            
        } 
        System.out.println("");
        System.out.println("Num of prime is: "+numofprime);
    
}

    
}

