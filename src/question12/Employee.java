/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author S542000
 */
public class Employee implements Comparable<Employee> {
	   private int empId;
	   private String empName;
	   private double empSalary;

	   /**
	   * @param empId
	   * @param empName
	   * @param empSalary
	   */
	   public Employee(int empId, String empName, double empSalary) {
	       this.empId = empId;
	       this.empName = empName;
	       this.empSalary = empSalary;
	   }

	   public int getEmpId() {
	       return empId;
	   }

	   public void setEmpId(int empId) {
	       this.empId = empId;
	   }

	   public String getEmpName() {
	       return empName;
	   }

	   public void setEmpName(String empName) {
	       this.empName = empName;
	   }

	   public double getEmpSalary() {
	       return empSalary;
	   }

	   public void setEmpSalary(double empSalary) {
	       this.empSalary = empSalary;
	   }

	   @Override
	   public String toString() {
	       return "Emp Id: " + empId + ", Emp Name: " + empName + ", Emp Salary: "
	               + empSalary;
	   }

	   @Override
	   public int compareTo(Employee other) {
	       if (this.empId < other.getEmpId())
	           return -1;
	       else if (this.empId > other.getEmpId())
	           return 1;
	       else
	           return 0;
	   }

}
