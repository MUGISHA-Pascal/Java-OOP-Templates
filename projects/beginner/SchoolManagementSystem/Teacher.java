public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String getDetails() {
        return "Teacher: " + name + ", Age: " + age + ", Subject: " + subject;
    }
}