
package pkgcontinue;


public class InnerLoop {
    
    public static void main(String[] args){
        
        for(int i =1;i<=10;i++){
            for(int j =1;j<=10;j++){
                
                if(i == 5 && j == 5){
                    continue;          /////back to inner for loop
                }
                
                    System.out.println(i+" "+j);
            }
        }
    }
    
}
