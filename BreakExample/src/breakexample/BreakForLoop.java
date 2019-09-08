
package breakexample;


public class BreakForLoop {
    public static void main(String[] args){
        int i;
        for(i=0;i<=5;i++){
            if(i == 3)
                break;      ///////breaking the loop
            
            else
                System.out.println(i);
        }
    }
    
}
