/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author S542000
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<Employee> emps = new ArrayList<Employee>();
       emps.add(new Employee(1111, "James", 56000));
       emps.add(new Employee(1004, "Mike", 54000));
       emps.add(new Employee(3245, "Rahul", 45000));
       emps.add(new Employee(2312, "Sachin", 32000));
       emps.add(new Employee(1009, "Rick", 78000));

       System.out.println("Displaying the employees List :");
       display(emps);
      

       Collections.sort(emps);
       System.out.println("\n\nAfter Sorting displaying the employees List :");
       display(emps);
      

        Collections.sort(emps, new SortBySalary());
               System.out.println("\n\nAfter Sorting by salary displaying the employees List :");
        display(emps);
  
      
    Collections.sort(emps, new SortByName());
    System.out.println("\n\nAfter Sorting by employee name displaying the employees List :");
    display(emps);
   }

   private static void display(ArrayList<Employee> emps) {
       for (Employee emp : emps) {
           System.out.println(emp);
       }
      
   }

}

