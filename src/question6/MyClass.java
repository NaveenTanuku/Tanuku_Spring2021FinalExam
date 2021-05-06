/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author S542000
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String crunchifyArr[] = { "Crunchify", "Google", "Yahoo", "Amazon", "eBay" };
		String myString = crunchifyArr[7]; // This throws ArrayIndexOutOfBoundException
		System.out.println(myString);
	}


    }
    
