public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}