
package mainproject;

public class WageEarner extends Employee
{
   protected double Sallary;
   
   private WageEarner(int Id, String title, String firstname, String lastname,String contractType,String dateofbirth,String nino,String Jobtitle,String department,double sallary)
    {
        super(Id,title,firstname,lastname,contractType,dateofbirth,nino,Jobtitle,department);
   
   Sallary=sallary;
}
   protected double Slr()
    {
return Sallary;
    }
   @Override
    void printExtensionProprieties() {
        System.out.println("Sallary: " + Sallary );
    }
}