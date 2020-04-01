
package mainproject;

public class CommissionEarner extends Employee
    {
    protected double commission;
    private double annualGrossSalary;
    
    private CommissionEarner(int Id, String title, String firstname, String lastname,String dateofbirth,String nino,JobTitle Jobtitle,Department department,double Commission,double annualGrossSalary)
    {
        super(Id,title,firstname,lastname,dateofbirth,nino,Jobtitle,department);
        
        this.commission=Commission;
        this.annualGrossSalary = annualGrossSalary;
    }
    
    protected double getCommission()
    {
        return commission;
    }
    
    @Override
    String extensionProprietiesToString() {
        return "Comission: " + commission  + "Annual Gross Salary: " + annualGrossSalary;
    }


    public static Employee newCommissionEarner(int Id,String title, String firstname, String lastname, String dateofbirth,String nino,JobTitle jobtitle,Department department, double comission, double annualGrossSalary) {
        
        if(!validateEmployee(Id, title, firstname, lastname, dateofbirth, nino)){
            return null;
        }
        
        return new CommissionEarner(Id, title, firstname, lastname, dateofbirth, nino, jobtitle, department, comission ,annualGrossSalary);
    }
}
