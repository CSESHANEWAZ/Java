
package breakexample;

public class BreakDoWhileLoop {
    public static void main(String[] args){
        
        int i =1;
        do{
            if(i == 3)
                break;       /////breaking from do while loop
            
            else
                System.out.println(i);
            
            i++;
              
            
        }while(i <= 5);
    }
    
}
