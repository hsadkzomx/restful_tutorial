package ie.nuig.cs.ct545rest;

import java.util.List;

/**
 * Employees.java is a wrapper class for an ArrayList 
 * that holds instances of the class Employee.
 * @author jiarongli
 *
 */
public class Employees 
{
    private List<Employee> employeeList;
 
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
 
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
