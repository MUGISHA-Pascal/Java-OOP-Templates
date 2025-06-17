package project002;

public class Employee {
    private String firstName; // First name of the employee
    private String lastName;  // Last name of the employee
    private String email;     // Email address of the employee
    private double salary;    // Salary of the employee

    // Constructor to initialize an Employee object with given properties
    public Employee(String firstName, String lastName, String email, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
    }

    // Default constructor
    public Employee() {
    }

    // Getter and setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override the toString method to customize the output format
    @Override
    public String toString() {
        // Return a string representation of the Employee object
        return "Employee{" +
                "firstName='" + firstName + '\'' + // Include first name
                ", lastName='" + lastName + '\'' + // Include last name
                ", email='" + email + '\'' +       // Include email address
                ", salary=" + salary +             // Include salary
                '}';
    }
}
