public abstract class Account {
    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accNum, String name, double bal) {
        this.accountNumber = accNum;
        this.holderName = name;
        this.balance = bal;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public abstract void withdraw(double amount);

    public String toString() {
        return "Account[" + accountNumber + "]: " + holderName + " has $" + balance;
    }
}