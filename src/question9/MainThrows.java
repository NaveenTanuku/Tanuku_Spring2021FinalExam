/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.IOException;

/**
 *
 * @author S542000
 */
public class MainThrows {

    /**
     * @param args the command line arguments
     */
    void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  

    public static void main(String[] args) {
        // TODO code application logic here
          MainThrows obj=new MainThrows();  
	   obj.p();  
	   System.out.println("normal flow...");  

    }
    
}
