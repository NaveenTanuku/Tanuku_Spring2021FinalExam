/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Naveen Tanuku S542000
 */
public class MainDrivere1 implements MyInterface,OurInterface {
    
    public void myMethod() {
        System.out.println("My Interface Method Implemented");
    }
     public void ourMethod(){
        System.out.println("Our Interface Method Implemented");
    }

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainDrivere1 md = new MainDrivere1();
        md.myMethod();
        md.ourMethod();
    }
    
}
