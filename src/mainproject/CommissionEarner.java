
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
    
    public static Employee newCommissionEarner(int Id,String title, String firstname, String lastname, String dateofbirth,String nino,String jobtitle,String department, double comission) {
        
        if(title == null || title.isEmpty()){
        return null;//if user left empty the code will be stopt.
        }
        if(firstname == null || firstname.isEmpty()){
        return null;//if user left empty the code will be stopt.
        }
        if(lastname == null || lastname.isEmpty()){
        return null;//if user left empty the code will be stopt.
        }
        if(nino == null || nino.isEmpty()){
        return null;//if user left empty the code will be stopt.
        }
        if(dateofbirth == null || dateofbirth.isEmpty()){
        return null;//if user left empty the code will be stopt.
        }
        if(Id == 0){
            return null;//if user left empty the code will be stopt.
        
        }
  
        
        return new CommissionEarner(Id, title, firstname, lastname, dateofbirth, nino, jobtitle, department, comission );
    }
}
