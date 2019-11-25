
package mainproject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
    private List<Employee> employeeList;
    
    public EmployeeRepo(){
        employeeList = new ArrayList<Employee>();
    }
    
    public void Add(Employee employee){
        
        if(employee.ID == 0)
        {
            return;
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
    }

