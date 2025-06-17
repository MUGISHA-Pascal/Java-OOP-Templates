package Project004;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(
                Arrays.asList(
                        new Student("John", 14, 1),
                        new Student("Jane", 13, 2),
                        new Student("Joe", 12, 3),
                        new Student("Jill", 13, 4),
                        new Student("Jim", 13, 5),
                        new Student("Jenny", 14, 6),
                        new Student("Jen", 13, 7),
                        new Student("Jenny", 12, 8),
                        new Student("Jen", 14, 9)
                )
        );

        students.forEach(s -> System.out.println(s.toString()));
    }
}
