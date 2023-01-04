class Person {
  
  String name;
  String address;
  
  public Person(String name, String address){
    this.name = name;
    this.address = address;
  }
  
  public String getName(){
    return name;
  }
  
  public String getAddress(){
    return address;
  }
  
  public String toString(){
    return "Person [Name: " + this.name + " Address: " + this.address + " ]" ;
  }
  
}
