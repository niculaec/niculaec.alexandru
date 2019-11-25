
package mainproject;

public class WageEarner extends Employee
{
   protected double Sallary;
   WageEarner(int Id, String title, String firstname, String lastname,String dateofbirth,String nino,String Jobtitle,String department,double sallary)
    {
        super(Id,title,firstname,lastname,dateofbirth,nino,Jobtitle,department);
   
   Sallary=sallary;
}
   protected double Slr()
    {
return Sallary;
    }
}