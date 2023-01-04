public class Student extends Person{
  
  String program;
  int year;
  double fee;
  
  public Student(String name, int year, double fee){
    super(name, "1234 street");
    this.program = "Art";
    this.year = year;
    this.fee = fee;
  }
  
  public String getProgram(){
    return program;
  }
  
  public String setProgram(String program){
    this.program = program;
    return program;
  }
  
  public int getYear(){
    return year;
  }
  
  public int setYear(int year){
    this.year = year;
    return year;
  }
  
  public double getFee(){
    return fee;
  }
  
  public double setFee(double fee){
    this.fee = fee;
    return fee;
  }
  
  public String toString(){
    return "Student [ " + super.toString() + ", Program: " + this.program + " Year: " + this.year + " Fee: " + this.fee + " ]" ;
  }
  
}
  
  

 