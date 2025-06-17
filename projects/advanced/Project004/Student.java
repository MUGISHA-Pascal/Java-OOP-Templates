package Project004;

public class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------------------------");
        return "Student`s Name: " + getName() + "\nStudent`s Age: " + getAge() + "\nStudent`s ID: " + getStudentId();
    }
}
