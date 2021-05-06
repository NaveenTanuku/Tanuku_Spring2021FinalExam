/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author S542000
 */
public class EqualsHashCode {

    public String name;
    public int id;
          
    EqualsHashCode(String name, int id) 
    {
              
        this.name = name;
        this.id = id;
    }
      
    @Override
    public boolean equals(Object obj)
    {
          
    // checking if both the object references are 
    // referring to the same object.
    if(this == obj)
            return true;
          
        // it checks if the argument is of the 
        // type equal by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof equal)) return false;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
        // type casting of the argument. 
        EqualsHashCode geek = (EqualsHashCode) obj;
          
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (geek.name == this.name && geek.id == this.id);
    }
      
    @Override
    public int hashCode()// This method returns the hash code value for the object on which this method is invoked.
    {
          
        // We are returning the equal_id as a hashcode value.
        // we can also return some other calculated value or may
        // be memory address of the Object on which it is invoked. 
        // it depends on how you implement  hashCode() method.
        return this.id;
    }
    public static void main(String[] args) {
        // TODO code application logic here
                // creating the Objects of Equal class.
    	EqualsHashCode g1 = new EqualsHashCode("aa", 1);
    	EqualsHashCode g2 = new EqualsHashCode("aa", 1);
          
        // comparing above created Objects.
        if(g1.hashCode() == g2.hashCode())
        {
  
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. "); 
    }
    
}
