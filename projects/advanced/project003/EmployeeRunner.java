package project003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        // Create a list of managers
        List<Manager> managers = new ArrayList<Manager>(
                Arrays.asList(
                        // Create objects of managers with their properties
                        new Manager("John", "Smith", "jdoe", 1000.0, "IT", 500.0),
                        new Manager("Jane", "Williams", "jane", 2000.0, "HR", 600.0),
                        new Manager("Joe", "Johnson", "joe", 3000.0, "IT", 700.0),
                        new Manager("Jill", "Anderson", "jill", 4000.0, "HR", 800.0),
                        new Manager("Jim", "Brown", "jim", 5000.0, "IT", 900.0),
                        new Manager("Jenny", "Taylor", "jenny", 6000.0, "HR", 1000.0),
                        new Manager("Jen", "Clark", "jen", 7000.0, "IT", 1100.0),
                        new Manager("Jenny", "Thomas", "jenny", 8000.0, "HR", 1200.0),
                        new Manager("Jen", "Wilson", "jen", 9000.0, "IT", 1300.0),
                        new Manager("Jack", "Miller", "jack", 10000.0, "HR", 1400.0),
                        new Manager("Jessica", "Martinez", "jessica", 11000.0, "IT", 1500.0),
                        new Manager("Justin", "Anderson", "justin", 12000.0, "HR", 1600.0),
                        new Manager("Julia", "Brown", "julia", 13000.0, "IT", 1700.0),
                        new Manager("Jacob", "Wilson", "jacob", 14000.0, "HR", 1800.0)
                )
        );

        // Print all properties of all managers
        managers.forEach(m -> System.out.println(m.toString()));

        // Print bonuses of all managers
        managers.forEach(m -> System.out.println(m.getBonus()));

        // Print departments of all managers
        managers.forEach(m -> System.out.println(m.getDepartment()));

        // Print first names of all managers
        managers.forEach(m -> System.out.println(m.getFirstName()));

        // Print last names of all managers
        managers.forEach(m -> System.out.println(m.getLastName()));

        // Print email addresses of all managers
        managers.forEach(m -> System.out.println(m.getEmail()));

        // Print salaries of all managers
        managers.forEach(m -> System.out.println(m.getSalary()));

        // Print properties of managers with salary greater than 10000
        managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.toString()));

        // Print bonuses of managers with salary greater than 10000
        managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getBonus()));

        // Print departments of managers with salary greater than 10000
        managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getDepartment()));

        // Print first names of managers with salary greater than 10000
        managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getFirstName()));

        // Print last names of managers with salary greater than 10000
        managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getLastName()));

        // Print email addresses of managers with salary greater than 10000
        managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getEmail()));
    }
}
