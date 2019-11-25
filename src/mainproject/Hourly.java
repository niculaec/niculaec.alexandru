
package mainproject;

public class Hourly extends Employee
{
    private double Hpay;
    Hourly(int Id, String title, String firstname, String lastname,String dateofbirth,String nino,String Jobtitle,String department,double HourPay)
    {
        super(Id,title,firstname,lastname,dateofbirth,nino,Jobtitle,department);
        
        Hpay=HourPay;
    }
    
    public double hourPay()
    {
        return Hpay;
     }
}
