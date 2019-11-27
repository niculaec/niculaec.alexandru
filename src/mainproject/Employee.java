
package mainproject;


public abstract class Employee {
    public int ID;
    public String Title;
    public String FirstName;
    public String LastName;
    public String DateOfBirth;
    public String  NINO;
    public String JobT;
    public String Department;
    
    Employee(int Id,String title, String firstname, String lastname, String dateofbirth,String nino,String jobtitle,String department)
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
    public String getJobT()
    {
        return JobT;
    }
    public String getDepartment()
    {
        return Department;
    }
    
    public void print(){
        System.out.println("title: " + Title + "\n" + "First name: " + FirstName  );
    }
}
