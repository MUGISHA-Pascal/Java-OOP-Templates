public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", 22, "Computer Science");
        Teacher t = new Teacher("Mr. Smith", 40, "Mathematics");

        System.out.println(s.getDetails());
        System.out.println(t.getDetails());
    }
}