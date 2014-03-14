package hearrates;


public class HeartRates {

    private String firstname;
    private String lastname;
    private int datebirth;
  
    public HeartRates(String first,String last, int date){
         firstname=first;
         lastname=last;
         datebirth=date;
    }

    
    
    public void setfirstname(String first){
    firstname=first;
     }
    
    public void setlastname(String last){
        lastname=last;
        
    }
    
    public void setdatebirth(int date){
        datebirth=date;
    }
    
    public String getfirstname(){
        return firstname;
    }
    
    public String getlastname(){
        return lastname;
    }
    
    public int getdatebirth(){
        return datebirth;
    }
    
    public int age(int date){
        return (2013-date);
    }
    
    public int HR(int age){
        return (220-age);
    }
    
    public double THR(double HR){
        return (0.5*HR);
    }
    
    public double THR1(double HR){
        return (0.85*HR);
    }
    
    
    
}
