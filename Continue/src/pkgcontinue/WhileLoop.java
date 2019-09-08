
package pkgcontinue;

/*@author mdshanewaz
 */
public class WhileLoop {
  public static void main(String[] args){
      int i =1;
      while(i <=5){
          
          if(i == 3){
              i++;
              continue;       ////back to while loop
               
          }                   ///i do not increment so while loop was stop
          
         
              System.out.println(i);
          
          i++;
      }
  }  
}
