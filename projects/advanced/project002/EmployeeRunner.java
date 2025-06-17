package project002;

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
                        new Manager("Jen", "Wilson", "jen", 9000.0, "IT", 1300.0)
                )
        );

        // Print all properties of all managers using a for-each loop
        for (Manager manager : managers) {
            System.out.println(manager.toString());
        }
    }
}
