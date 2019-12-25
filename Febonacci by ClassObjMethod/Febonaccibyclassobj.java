package classobjmethod1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Febonaccibyclassobj {
    
     public static void main(String[] args) {
        Febonacci f=new Febonacci();
        
      // TODO code application logic here
         System.out.print("Fibonacci of 10 is: ");
        for(int i=1;i<11;i++){
        f.display();
        f.inc();
      
        }
     }
          
}
