
package fibonacciseries;

import java.util.Scanner;


public class FibonacciSeries {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         int i,ans=0,x=0,y=1,z,n;
        System.out.print("Enter the number of term:");
        n = input.nextInt();
        
       
        for(i=0;i<n;i++){
            if(i == 0){
                System.out.println(x);         ////print 0
                continue;                     ///back to loop
            }
            if(i == 1){
                System.out.println(y);       ////print 1
                continue;                     ////back to loop
            }
            
            
            
            z = x + y;
            x = y;
            y = z;
            
            
            System.out.println(z+" ");
        }
        
    }
    
}
