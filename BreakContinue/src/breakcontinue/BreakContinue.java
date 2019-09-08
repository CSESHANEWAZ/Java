
package breakcontinue;


public class BreakContinue {

    
    public static void main(String[] args) {
        
        int i,j;
        for(i=1;i<=20;i++){
            
                if(i == 10 ){
                    continue;             ////back to loop
                }
                
                if(i == 15){
                    break;
                }
                System.out.println(i);
            }
            
        }
    }
    

