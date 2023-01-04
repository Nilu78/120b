Implement 3 classes based on the following requirements:

Person class:
Instance variables (all private):
-name
-address
Constructor:
-initializes name and address
Instance methods:
-getter and setters for name and address
-toString()  method that returns name and address values

Student class (needs to inherit from Person class):
Instance variables (all private):
-program
-year
-fee  
Constructor:
-initializes all fields (name, address,program, year, fee). Use super() to initialize superclass variables.
Instance methods:
-getter and setters for program, year, fee.
-toString()  method that returns the values of all fields(name, address,program, year, fee). Use super to call super class toString() method.

Staff class (needs to inherit from Person class):
Instance variables (all private):
-school
-pay 
Constructor:
-initializes all fields (school, pay, program, year, fee). Use super() to initialize superclass variables.
Instance methods:
-getter and setters for school, pay.
-toString()  method that returns the values of all fields(name, address,school, pay). Use super to call super class toString() method.

Once the implementation is done, create object of Student and Staff classes call their methods to check for correct implementation.
In particular, call toString() method to check if it is being overridden correctly.