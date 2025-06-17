package project006;

public class Runner {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(5, 5);

        System.out.println("Circle Area: " + shape1.area());
        System.out.println("Rectangle Area: " + shape2.area());

        System.out.println("Circle Perimeter: " + shape1.perimeter());
        System.out.println("Rectangle Perimeter: " + shape2.perimeter());
    }
}
