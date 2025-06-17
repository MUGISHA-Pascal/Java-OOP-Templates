public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.display();
    }
}