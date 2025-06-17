package project001;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private double salary;

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
        StringBuilder sb = new StringBuilder();
        sb.append(" _____________________________________\n");
        sb.append("|                                     |\n");
        sb.append("|  Employee Information:              |\n");
        sb.append("|  Name: ").append(firstName).append(" ").append(lastName);
        // Adjust spaces to align the name properly
        for (int i = 0; i < 36 - (firstName.length() + lastName.length()); i++) {
            sb.append(" ");
        }
        sb.append("|\n");
        sb.append("|  Email: ").append(email);
        // Adjust spaces to align the email properly
        for (int i = 0; i < 35 - email.length(); i++) {
            sb.append(" ");
        }
        sb.append("|\n");
        sb.append("|  Salary: $").append(String.format("%.2f", salary));
        // Adjust spaces to align the salary properly
        for (int i = 0; i < 34 - String.format("%.2f", salary).length(); i++) {
            sb.append(" ");
        }
        sb.append("|\n");
        sb.append("|_____________________________________|\n");
        return sb.toString();
    }
}
