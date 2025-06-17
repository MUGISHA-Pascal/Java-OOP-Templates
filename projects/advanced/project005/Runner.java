package project005;

public class Runner {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(5, 10);

        System.out.println("Circle Area: " + shape1.area());
        System.out.println("Rectangle Area: " + shape2.area());
    }
}
