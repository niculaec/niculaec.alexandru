package mainproject;

import java.util.Scanner;

/*@author Alexu*/
public class MainProject {

    public static void displayAddEmployeeSubMenu(Scanner scanner)//denimirea metodei si denimirea variabilei
    {
        System.out.println("A.WageErner: " );
        System.out.println("B.Hourly: " );
        System.out.println("C.CommissionEarner: ");
        System.out.println("D.Back:");

        int Id;
        String title;
        String firstname;
        String lastname;
        String dateofbirth;
        String nino;
        JobTitle jobtitle;
        Department department;
        String input = scanner.nextLine();

        double wage = 0;
        ContractType jobType = ContractType.PART_TIME;
        
        double comission = 0;
        double annualGrossSalary = 0;

        double hourly = 0;

 
        input = input.toUpperCase();//Convert any letter in Upper case letter
       
        short selectedType;// short 16 bit number 
        switch(input){
            case"A": //instructiune
                selectedType = 0;
                System.out.println("Enter annualSallary value" );
                wage = scanner.nextDouble();

               
                int jobTypeSelection = 0;
                while(jobTypeSelection < 1 || jobTypeSelection > 2){

                    System.out.println("Enter Job type\n" +
                    "1. Part time\n" +
                    "2. Full time");

                    jobTypeSelection = scanner.nextInt();
                }
        
                switch(jobTypeSelection){
                    case 1:
                        jobType = ContractType.PART_TIME;
                        break;
                    case 2:
                        jobType = ContractType.FULL_TIME;
                        break;
                }

                break;
            case"B":
                selectedType = 1;
                System.out.println("Enter hourly value" );
                hourly = scanner.nextDouble();
                break;
            case"C":
                selectedType = 2;
                System.out.println("Enter commision value" );
                comission = scanner.nextDouble();

                System.out.println("Enter annual gross salary value" );
                annualGrossSalary = scanner.nextDouble();
                break;
            default:
                  System.out.println("Invalid commnad\n" );
                  return;
        }

        System.out.println("Please enter Employee ID:");
        Id=scanner.nextInt();
       
        System.out.println("Please enter Employee Title");
        title=scanner.next();
        scanner.nextLine();
        
        System.out.println("Please enter First Name");
        firstname=scanner.nextLine();

        if(firstname.isEmpty()){
            System.out.println("Invalid firstname" );
            return;
        }
        
        //TODO de facut verificari pentru fiecare variabila
        
        System.out.println("Please enter Last Name");
        lastname=scanner.nextLine();
        
        System.out.println("Please enter Date Of Birth");
        dateofbirth=scanner.nextLine();
        
        System.out.println("Please enter National insurens Number ");
        nino=scanner.nextLine();
        
        System.out.println("Please select Employee Job Title\n ");
        int index = 0;
        for (JobTitle jTitle : JobTitle.values()) {
            System.out.println(index + " " + jTitle);
            index++;
        }

        int intInput = scanner.nextInt();

        while(intInput >= JobTitle.values().length){
            System.out.println("Please select a valid value ");
            intInput = scanner.nextInt();
        }
        
        jobtitle= JobTitle.values()[intInput];
        
        System.out.println("Please select Employeee Department ");
        index = 0;
        for (Department departmentEnum : Department.values()) {
            System.out.println(index + " " + departmentEnum);
            index++;
        }

        intInput = scanner.nextInt();

        while(intInput >= Department.values().length){
            System.out.println("Please select a valid value ");
            intInput = scanner.nextInt();
        }
        
        department= Department.values()[intInput];

        
        Employee employee = null;
        switch(selectedType){
            case 0: 
                employee = WageEarner.newWageEarner(Id, title, firstname, lastname, dateofbirth, nino, jobtitle, department, wage,jobType);
                break;
            case 1: 
                employee = Hourly.newHourly(Id, title, firstname, lastname, dateofbirth, nino, jobtitle, department, hourly);
                break;
            case 2: 
                employee = CommissionEarner.newCommissionEarner(Id, title, firstname, lastname, dateofbirth, nino, jobtitle, department, comission, annualGrossSalary);
                break;
        }
        
        if(employee == null){
            System.out.println("Could not create employee");
        } else {
            employeeRepo.Add(employee);
            System.out.println("Added employee");
        }   

        // Wait for user to continue
        scanner.next();
    }
    
    public static void displayRemoveEmployeeSubMenu(Scanner scanner){

        employeeRepo.printAllEmployeesTable();

        System.out.println("Select employee by ID");

        int id = scanner.nextInt();

        if(employeeRepo.remove(id)){
            System.out.println("Removed employee with ID:" + id);
        } else {
            System.out.println("Could not find employee");
        }

         // Wait for user to continue
         scanner.nextLine();
    }

    private static void displayViewEmployeeSubMenu(Scanner scanner){

        System.out.println("Select employee list\n" +
        "A. All employees\n" +
        "B. Salaried employees\n" +
        "C. Hourly employees\n" +
        "D. Commission employees\n" +
        "E. Back");

        
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "A":
                employeeRepo.printAllEmployeesTable();
                break;
            case "B":
                employeeRepo.printSalaryEmployeesTable();
                    break;
            case "C":
                employeeRepo.printHourlyEmployeesTable();
                break;
            case "D":
                employeeRepo.printCommissionEmployeesTable();
                break;
            default:
            return;
        }

    

        System.out.println("Select employee by ID");

        int id = scanner.nextInt();

        Employee employee =  employeeRepo.get(id);
        if(employee == null){
            System.out.println("Invalid ID");
        }
        else{
            employee.print();
        }

        // Wait for user to continue
        scanner.nextLine();
    }

    public static void Menu()
    {
        System.out.println("----------------------");
        System.out.println("- MARLINE PRODUCTION -");
        System.out.println("-      Payroll       -");
        System.out.println("----------------------");
        System.out.println("1. Add Employee" );
        System.out.println("2. View Employee" );
        System.out.println("3. Remove Employee ");
        System.out.println("4. Generate Pay Slip");
        System.out.println("5. Exit");
        System.out.println("Please select an Option");
    }
    
    private static EmployeeRepo employeeRepo = new EmployeeRepo();
    
    public static void main(String[] args) {    
        
        Scanner scaner = new Scanner(System.in);    
        
        // test data
        employeeRepo.Add(WageEarner.newWageEarner(21, "title", "firstname1", "lastname1", "dateofbirth", "nino", JobTitle.CEO, Department.MARKETING, 77000,ContractType.FULL_TIME));
        employeeRepo.Add(Hourly.newHourly(77, "title", "firstname2", "lastname2", "dateofbirth", "nino",  JobTitle.DIRECTOR, Department.PRODUCTION, 42));
        employeeRepo.Add(CommissionEarner.newCommissionEarner(420, "title", "firstname3", "lastname3", "dateofbirth", "nino",  JobTitle.OFFICE_WORKER, Department.SALES, 0.21,30000));

        while(true){//bucla infinita si brake opreste codul.
        
            System.out.flush();
            Menu();
            
            String userInput =   scaner.nextLine();  

            switch(userInput){
                case "1" : 
                    displayAddEmployeeSubMenu(scaner);
                    break;
                case "2" : 
                    displayViewEmployeeSubMenu(scaner);
                    break;
                case "3" : 
                    displayRemoveEmployeeSubMenu(scaner);
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                      System.out.println("Invalid commnad\n" );
            }
        }
    }
}

