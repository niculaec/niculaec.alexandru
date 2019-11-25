
package mainproject;

public class CommissionEarner extends Employee
    {
    protected double Comm;
    CommissionEarner(int Id, String title, String firstname, String lastname,String dateofbirth,String nino,String Jobtitle,String department,double Commission)
    {
        super(Id,title,firstname,lastname,dateofbirth,nino,Jobtitle,department);
        
        Comm=Commission;
    }
    protected double Commissions()
    {
        return Comm;
     }
}
