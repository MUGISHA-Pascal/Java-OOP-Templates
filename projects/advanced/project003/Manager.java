package project003;

public class Manager extends Employee {
    private String department; // Department of the manager
    private double bonus;      // Bonus amount for the manager

    // Constructor to initialize a Manager object with given properties
    public Manager(String firstName, String lastName, String email, double salary, String department, double bonus) {
        super(firstName, lastName, email, salary); // Call the constructor of the superclass (Employee)
        this.department = department; // Initialize the department
        this.bonus = bonus;           // Initialize the bonus
    }

    // Getter and setter methods for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter and setter methods for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override the toString method to customize the output format
    @Override
    public String toString() {
        // Return a string representation of the Manager object
        return "Manager{" +
                "firstName='" + getFirstName() + '\'' + // Include first name
                ", lastName='" + getLastName() + '\'' + // Include last name
                ", email='" + getEmail() + '\'' +       // Include email address
                ", salary=" + getSalary() +             // Include salary
                ", department='" + department + '\'' +  // Include department
                ", bonus=" + bonus +                    // Include bonus
                '}';
    }
}
