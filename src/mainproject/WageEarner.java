
package mainproject;

public class WageEarner extends Employee
{
    protected double annualSallary;
    protected ContractType jobType;
   
    private WageEarner(int Id, String title, String firstname, String lastname,String dateofbirth,String nino,JobTitle Jobtitle,Department department,double anualSallary, ContractType jobType)
    {
        super(Id,title,firstname,lastname,dateofbirth,nino,Jobtitle,department);
   
        annualSallary=anualSallary;
        this.jobType=jobType;
    }

    protected double getAnunalSallary()
    {
        return annualSallary;
    }
    
    @Override
    void printExtensionProprieties() {
        System.out.println("Annual Sallary: " + annualSallary + " Job Type:" + jobType.toString() );
    }

    public static Employee newWageEarner(int Id,String title, String firstname, String lastname, String dateofbirth,String nino,JobTitle jobtitle,Department department, double wage, ContractType jobType) {
        
        if(!validateEmployee(Id, title, firstname, lastname, dateofbirth, nino)){
            return null;
        }
        
        return new WageEarner(Id, title, firstname, lastname, dateofbirth, nino, jobtitle, department, wage, jobType );
    }
}