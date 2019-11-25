package mainproject;

import java.util.Scanner;

/*@author Alexu*/
public class MainProject {

        public static void SubMenu()
        {
            System.out.println("WageErner: " );
            System.out.println("Hourly: " );
            System.out.println("CommissionEarner: ");
        }
          public static void Menu()
        {
            System.out.println("Add Employee: " );
            System.out.println("View Employee: " );
            System.out.println("Remove Employee: ");
        }
    public static void main(String[] args) {

        
        EmployeeRepo repo = new EmployeeRepo();
        
        Scanner scaner = new Scanner(System.in);
        
    
      
      while(true){//bucla infinita si brake opreste codul.
      String userInput =   scaner.nextLine();  
      Menu();
        System.out.println("user input is: " + userInput);
          if(userInput.equals("1"))
              SubMenu();
          if(userInput.equals("5")){
              break;
              
          }
      }
        
    
        
//        Employee newEmployee = Employee.newEmplayee(0, title, firstname, lastname, dateofbirth, nino, jobtitle, department);
//        repo.Add(newEmployee);
//        
//        Employee employee = repo.get(77);
//        if(employee == null){
//            System.out.println("Employee not found");
//        } else{
//            employee.print();
//        }
    }
}
