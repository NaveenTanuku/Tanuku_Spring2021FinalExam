/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author S542000
 */
public class MultipleThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              try{
	         int arr[]=new int[7];
	         arr[4]=30/0;
	         System.out.println("Last Statement of try block");
	      }
	      catch(ArithmeticException e){
	         System.out.println("You should not divide a number by zero");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Accessing array elements outside of the limit");
	      }
	      catch(Exception e){
	         System.out.println("Some Other Exception");
	      }
	      System.out.println("Out of the try-catch block");

    }
    
}
