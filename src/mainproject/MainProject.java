package mainproject;

import java.util.Scanner;

/*@author Alexu*/
public class MainProject {

    public static void AddEmployeeSubMenu(Scanner scanner)
    public static void displayAddEmployeeSubMenu(Scanner scanner)//denimirea clasei si denimirea variabilei
    {
        System.out.println("A.WageErner: " );
        System.out.println("B.Hourly: " );
        System.out.println("C.CommissionEarner: ");
        System.out.println("D.Back:");
        int id;
        String title;
        String firstname;
        String lastname;
        String dateofbirth;
        String nino;
        String jobtitle;
        String department;
        String input = scanner.nextLine();
        double wageearner;
        double commision;
        double hourly;
        String employeeType;
        input = input.toUpperCase();//Convert any letter in Upper case letter
       
        short selectedType;// short 16 bit number 
        switch(input){
            case"A": //instructiune
                selectedType = 0;
                System.out.println("Please enter Employee ID:");
                id=scanner.nextInt();
               
                System.out.println("Please enter Employee Title");
                title=scanner.nextLine();
                
                System.out.println("Please enter First Name");
                firstname=scanner.nextLine();
                
                System.out.println("Please enter Last Name");
                lastname=scanner.nextLine();
                
                System.out.println("Please enter Date Of Birth");
                dateofbirth=scanner.nextLine();
                
                System.out.println("Please enter National insurens Number ");
                nino=scanner.nextLine();
                
                System.out.println("Please enter Employee Job Title ");
                jobtitle=scanner.nextLine();
                
                System.out.println("Please enter Employeee Department ");
                department=scanner.nextLine();
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

