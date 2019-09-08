
package operator;

public class IncrementDecrement {
    
    public static void main(String[] args){
        int x,y,z,s,r;
        x = 15;
        
        z = ++x;
        y = x++;
        
        z = x;
         System.out.println("z = "+z);
        
        s = x--;
        r = --x;
        System.out.println("r = "+r);
        
        y = x;
        
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("s = "+s);
        System.out.println("r = "+r);
    
    
    }
    
}
