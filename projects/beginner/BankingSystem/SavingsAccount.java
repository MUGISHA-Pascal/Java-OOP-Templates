public class SavingsAccount extends Account {
    public SavingsAccount(int accNum, String name, double bal) {
        super(accNum, name, bal);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}