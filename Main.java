class Main {

  public static void main(String[] args) {

  Staff staff = new Staff(" AYA", 10.000);

    staff.setSchool("AYA");

    staff.setPay(10.000);

    System.out.println();

    System.out.println("School: "+staff.getSchool());

    System.out.println("Pay: "+staff.getPay());

     System.out.println(staff.toString());





    //object of student

    Student student = new Student("Art",2020,900);

    student.setProgram("Art");

    student.setYear(2020);

    student.setFee(900);

    System.out.println("Program: " + student.getProgram());

    System.out.println("Year:" + student.getYear());

    System.out.println("Fee:" + student.getFee());

    System.out.println(student.toString());



   



   



  }

}
    
  
