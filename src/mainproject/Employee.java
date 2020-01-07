
package mainproject;


public abstract class Employee {
    public int ID;
    public String Title;
    public String FirstName;
    public String LastName;
    public String DateOfBirth;
    public String  NINO;
    public JobTitle JobT;
    public Department Department;
    
    Employee(int Id,String title, String firstname, String lastname, String dateofbirth,String nino,JobTitle jobtitle,Department department)
    {
        this.ID=Id;
        this.Title=title;
        this.FirstName=firstname;
        this.LastName=lastname;
        this.DateOfBirth=dateofbirth;
        this.NINO=nino;
        this.JobT=jobtitle;
        this.Department=department;//depertment job
    }

    private static boolean containsNumbers(String string){
        for (char character : string.toCharArray()) {
            try {
                Double.parseDouble(""+character);
                return true;
            } catch (Exception e) {}
        }

        return false;
    }

    public static boolean validateEmployee(int Id,String title, String firstname, String lastname, String dateofbirth,String nino){
        
        if(title == null || title.isEmpty()){
            return false;//if user left empty the code will be stopt.
        }
        
        if(firstname == null || firstname.isEmpty()){
            return false;//if user left empty the code will be stopt.
        } else{
            if(containsNumbers(firstname)){
                System.out.println("First name can not contain numbers");
                return false;
            }
        }
        if(lastname == null || lastname.isEmpty()){
            return false;//if user left empty the code will be stopt.
        } else{
            if(containsNumbers(lastname)){
                System.out.println("Last name can not contain numbers");
                return false;
            }
        }
        
        if(nino == null || nino.isEmpty()){
            return false;//if user left empty the code will be stopt.
        }
        
        if(dateofbirth == null || dateofbirth.isEmpty()){
            return false;//if user left empty the code will be stopt.
        }
        
        if(Id == 0){
            return false;//if user left empty the code will be stopt.
        }

        return true;
    }

    public boolean equals(Employee employee){

        if(employee == null){
            return false;
        }

        if(this.ID == employee.ID){
            return true;
        } else if(this.FirstName.equals(employee.FirstName) && this.LastName.equals(employee.LastName)){
            return true;
        }

        return false;
    }
   
    
    public int getid()
    {
        return ID;
    }
    public String getTille()
    {
        return Title;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public String getDateOfBirth()
    {
        return DateOfBirth;
    }
    public String getNINO()
    {
        return NINO;
    }
    public JobTitle getJobT()
    {
        return JobT;
    }
    public Department getDepartment()
    {
        return Department;
    }
    
    abstract String extensionProprietiesToString();

    private String baseProprietiesToString(){

        //TODO de completat
        return "title: " + Title + "\n" + "First name: " + FirstName;
    }

    public final String toString(){
        return baseProprietiesToString() +
        extensionProprietiesToString();
    }
}
