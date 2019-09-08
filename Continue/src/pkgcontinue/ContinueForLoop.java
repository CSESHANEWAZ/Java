
package pkgcontinue;


public class ContinueForLoop {
    public static void main(String[] args){
        
        for(int i=1;i<=10;i++){
            if(i == 5){
                  continue;   /////back to for loop
            }
                System.out.println(i);
                
        }
    }
}
