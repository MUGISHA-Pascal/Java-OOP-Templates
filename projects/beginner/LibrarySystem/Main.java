public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "Herbert Schildt");
        b1.display();
        b1.borrowBook();
        b1.display();
        b1.returnBook();
        b1.display();
    }
}