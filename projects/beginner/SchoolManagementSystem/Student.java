public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getDetails() {
        return "Student: " + name + ", Age: " + age + ", Major: " + major;
    }
}