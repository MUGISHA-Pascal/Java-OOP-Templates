public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(1001, "Alice", 5000);
        acc1.deposit(1500);
        acc1.withdraw(2000);
        System.out.println(acc1);
    }
}