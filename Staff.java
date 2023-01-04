public class Staff extends Person {
  
  String school;
  double pay;
  
  
  public Staff(String school, double pay){
    super("Art","1234 street");
    this.school = school;
    this.pay = pay;
  }
  
  public String getSchool(){
    return school;
  }
  
  public String setSchool(String school){
    this.school = school;
    return school;
  }
  
  public double getPay(){
    return pay;
  }
  
  public double setPay(double pay){
    this.pay = pay;
    return pay;
  }
  
  public String toString(){
    return "Staff [ " + super.toString() + ", School: " + this.school + " Pay: " + this.pay + " ]" ;
  }
  
}

 

    
    

  