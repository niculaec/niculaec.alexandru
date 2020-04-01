
package mainproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeRepo {
    private List<Employee> employeeList;
    
    public EmployeeRepo(){
        employeeList = new ArrayList<Employee>();
    }
    
    public void Add(Employee employee){
        
        if(employee == null)
        {
            return;
        }        
        
        if(employee.ID == 0)
        {
            return;
        }        
        
        for(Employee currentemployee : employeeList){
            if(currentemployee.equals(employee)){
                return;
            }
        }

        employeeList.add(employee);
    }
    
    public Employee get(int id){
        
        for(Employee employee : employeeList){
            if(employee.ID == id){
                return employee;
                
            }
        }
        
        return null;
    
    }

    public boolean remove(int id){
        
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if(employee.ID == id){
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public void printAllEmployeesTable(){

        int index = 0;
        System.out.println("index \t ID \t Name");
        for (Employee employee : employeeList) {
            System.out.println(index + " \t " + employee.ID + " \t " + employee.FirstName + " " + employee.LastName);
            index++;
        }

    }

    public void printSalaryEmployeesTable(){

        int index = 0;
        System.out.println("index \t ID \t Name");
        for (Employee employee : employeeList) {

            if(employee instanceof WageEarner){

                System.out.println(index + " \t " + employee.ID + " \t " + employee.FirstName + " " + employee.LastName);
                index++;
            }
        }
    }

    public void printCommissionEmployeesTable(){

        int index = 0;
        System.out.println("index \t ID \t Name");
        for (Employee employee : employeeList) {

            if(employee instanceof CommissionEarner){
          
                System.out.println(index + " \t " + employee.ID + " \t " + employee.FirstName + " " + employee.LastName);
                index++;
            }
        }
    }

    public void printHourlyEmployeesTable(){

        int index = 0;
        System.out.println("index \t ID \t Name");
        for (Employee employee : employeeList) {

            if(employee instanceof Hourly){
        
                System.out.println(index + " \t " + employee.ID + " \t " + employee.FirstName + " " + employee.LastName);
                index++;
            }
        }
    }
}

