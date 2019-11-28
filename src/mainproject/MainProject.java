package mainproject;

import java.util.Scanner;

/*@author Alexu*/
public class MainProject {

    public static void AddEmployeeSubMenu(Scanner scanner)
    {
        System.out.println("A.WageErner: " );
        System.out.println("B.Hourly: " );
        System.out.println("C.CommissionEarner: ");
        
        String input = scanner.nextLine();
        
        input = input.toUpperCase();//Convert any letter in Upper case letter
       
        short selectedType;// short 16 bit number 
        switch(input){
            case"A": 
                selectedType = 0;
                System.out.println("Enter wage value" );
                break;
            case"B":
                selectedType = 1;
                System.out.println("Enter hourly value" );
                break;
            case"C":
                selectedType = 2;
                System.out.println("Enter commision value" );
                break;
            default:
                  System.out.println("Invalid commnad\n" );
                  return;
        }
     
        int earningValue = scanner.nextInt();
        
          
     
          
          
          String name = scanner.nextLine();
       
          if(name.isEmpty()){
                System.out.println("Invalid name" );
                return;
          }
          
          
          Employee employee = null;
          switch(selectedType){
              case 0: 
                  //employee = new WageErner(name, bla bla);
                  break;
          }
          
          if(employee == null){
            System.out.println("Could not creeate employee");
          } else {
               System.out.println("Added employee");
            employeeRepo.Add(employee);
          }
      //  int wadgeValue = Integer.parseInt(input);//string to interger
      
         
    }
    
    public static void Menu()
    {
        System.out.println("----------------------");
        System.out.println("- Payroll Aplication -");
        System.out.println("----------------------");
        System.out.println("1. Add Employee: " );
        System.out.println("2. View Employee: " );
        System.out.println("3. Remove Employee: ");
        System.out.println("4. Generate Pay Slip:");
        System.out.println("5. Exit:");
        System.out.println("Please select an Option");
    }
    
    
    private static EmployeeRepo employeeRepo = new EmployeeRepo();
    
    public static void main(String[] args) {    
        
        Scanner scaner = new Scanner(System.in);        
        
        while(true){//bucla infinita si brake opreste codul.
        
            Menu();
            
            String userInput =   scaner.nextLine();  

            switch(userInput){
                case "1" : 
                    AddEmployeeSubMenu(scaner);
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                      System.out.println("Invalid commnad\n" );
            }
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

