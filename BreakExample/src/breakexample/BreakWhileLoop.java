
package breakexample;


public class BreakWhileLoop {
    public static void main(String[] args){
        int i = 1;
        while(i <= 5){
            if(i == 3)
                break;         //////breaking from while loop
            
            else
                System.out.println(i);
            
            i++;
        }
    }
}
