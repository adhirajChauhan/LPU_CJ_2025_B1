final class Animal{
    final void makeSound(){
        System.out.println("Animal makes sound");
    }
}

// class Dog extends Animal{
    // void makeSound(){
    //     System.out.println("Dog barks");
    // }
// }

public class final_2 {
    public static void main(String[] args) {
        
    }
}




//Problem statement

// Create a final Class: Company
// This class cannot be inherited.
// Contains a static final variable COMPANY_NAME = "XYZ".
// A static method displayCompany() that prints the company name.


// Create a Parent Class: Employee
// Instance Variables:
// private String name
// private int employeeId
// final double baseSalary (Must be initialized in the constructor)
// Constructor to initialize name, employeeId, and baseSalary.
// A final method displayEmployeeDetails() to print employee information.
// A method calculateSalary() that returns baseSalary (This method should be overridden in subclasses).


// Create Two Subclasses: FullTimeEmployee and PartTimeEmployee
// FullTimeEmployee Class
// Inherits Employee.
// Overrides the calculateSalary() method to return baseSalary + 2000 as a bonus.
// PartTimeEmployee Class
// Inherits Employee.
// Overrides the calculateSalary() method to return baseSalary * 0.75 (since part-time employees get 75% of base salary).


// Implement the main() Method
// Display the company name using Company.displayCompany().
// Create a FullTimeEmployee object and a PartTimeEmployee object.
// Display their details using displayEmployeeDetails().
// Call calculateSalary() for both employees and print their salaries.