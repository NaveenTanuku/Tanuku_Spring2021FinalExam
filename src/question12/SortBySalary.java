/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.Comparator;

/**
 *
 * @author S542000
 */
public class SortBySalary implements Comparator<Employee> {

   @Override
   public int compare(Employee e1, Employee e2) {
       if (e1.getEmpSalary() > e2.getEmpSalary()) {
           return 1;
       } else if (e1.getEmpSalary() < e2.getEmpSalary()) {
           return -1;
       } else {
           return 0;
       }
   }
}
