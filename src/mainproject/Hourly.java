
package mainproject;

public class Hourly extends Employee
{
    private double Hpay;
    
    private Hourly(int Id, String title, String firstname, String lastname,String dateofbirth,String nino,JobTitle Jobtitle,Department department,double HourPay)
    {
        super(Id,title,firstname,lastname,dateofbirth,nino,Jobtitle,department);
        
        Hpay=HourPay;
    }
    
    public double hourPay()
    {
        return Hpay;
    }

    @Override
    String extensionProprietiesToString() {
       return "HourPay: " + Hpay;
    }


    public static Employee newHourly(int Id,String title, String firstname, String lastname, String dateofbirth,String nino,JobTitle jobtitle,Department department, double hourly) {
        
        if(!validateEmployee(Id, title, firstname, lastname, dateofbirth, nino)){
            return null;
        }
        
        return new Hourly(Id, title, firstname, lastname, dateofbirth, nino, jobtitle, department, hourly );
    }
}
