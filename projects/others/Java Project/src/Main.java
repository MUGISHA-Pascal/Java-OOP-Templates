import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int minBalanceToOpen = 1000;
    private static final int minBalanceRemainAfterWithdraw = 1000;

    public static void main(String[] args)
    {
        BankingApplication bankingapp = new BankingApplication();
        Scanner scanner = new Scanner(System.in);
        int choices;
        do {
            System.out.println("Available Choices\n1.Create a new Account\n2.Display all accounts\n3.Update an account\n4.Delete an account\n5.Deposit an amount into your account\n6.Withdraw an amount from your account\n7.Search for an account\n8.Exit\n");
            System.out.println("Enter your choice: ");
            choices = scanner.nextInt();

            switch (choices)
            {
                case 1:
                    bankingapp.createAccount();
                    break;
                case 2:
                    bankingapp.displayAllAccounts();
                    break;
                case 3:
                    int accountNumber;
                    System.out.println("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    bankingapp.updateAccountBalance(accountNumber);
                    break;
                case 4:
                    System.out.println("Enter account number to delete: ");
                    accountNumber = scanner.nextInt();
                    bankingapp.deleteAccount(accountNumber);
                    break;
                case 5:
                    System.out.println("Enter account number to deposit: ");
                    accountNumber = scanner.nextInt();
                    bankingapp.depositAmount(accountNumber);
                    break;
                case 6:
                    System.out.println("Enter account number to withdraw: ");
                    accountNumber = scanner.nextInt();

                    bankingapp.withdrawAmount(accountNumber);
                    break;
                case 7:
                    System.out.println("Enter account number to search: ");
                    accountNumber = scanner.nextInt();
                    bankingapp.searchAccount(accountNumber);
                    break;
                case 8:
                    System.out.println("Exit the application");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while(choices != 8);

    }
    private  static  class BankingApplication
    {
        private List<Account> accounts;

        BankingApplication()
        {
            accounts = new ArrayList<>();
        }

        private boolean isAccountNumberUnique(int accountNumber)
        {
            for(Account account : accounts){
                if(account.number == accountNumber)
                {
                    return  false;
                }
            }
            return  true;
        }

        void createAccount(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select account type\n1. Salary Account\n2. Savings Account\n3. Current Account\n");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            int number;
            do{
                System.out.print("Enter account number: ");
                number = scanner.nextInt();
                if(!isAccountNumberUnique(number)){
                    System.out.println("Account Number exists! Please use different number");
                }
            }while (!isAccountNumberUnique(number));

            System.out.print("Enter creation date: ");
            String creationDate = scanner.next();

            int balance;
            do{
                System.out.print("Enter account balance: ");
                balance = scanner.nextInt();
                System.out.print("\n");
                if(balance < minBalanceToOpen)
                {
                    System.out.println("Opening Balance must be at least " + minBalanceToOpen + ".");

                }
            } while (balance < minBalanceToOpen);
            switch (choice)
            {
                case 1:
                    accounts.add(new SalaryAccount(name, number, creationDate, balance));
                    break;
                case 2:
                    accounts.add(new SavingsAccount(name, number, creationDate, balance));
                    break;
                case 3:
                    accounts.add(new CurrentAccount(name, number, creationDate, balance));
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        void displayAllAccounts()
        {
            for (Account account : accounts) {
                account.display();
            }
        }

        private boolean isAccountExist(int accountNumber)
        {
            for(Account account : accounts){
                if(account.number == accountNumber)
                {
                    return  true;
                }
            }
            return  false;
        }
        void updateAccountBalance(int accountNumber)
        {
            if(isAccountExist(accountNumber))
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter amount to be updated: ");
                int amount = scanner.nextInt();
                for (Account account : accounts) {
                    if (account.number == accountNumber) {
                        account.updateBalance(amount);
                        System.out.println("Balance updated successfully!");
                        return;
                    }
                }
            }
            System.out.println("Account not found!");
        }

        void deleteAccount(int accountNumber)
        {
            boolean accountFound = false;

            for (Account account : accounts) {
                if (account.number == accountNumber) {
                    accounts.remove(account);
                    System.out.println("Account deleted successfully!");
                    accountFound = true;
                    break;
                }
            }

            if (!accountFound) {
                System.out.println("Account not found!");
            }
        }

        void depositAmount(int accountNumber)
        {
            if(isAccountExist(accountNumber))
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter amount to be deposited: ");
                int amount = scanner.nextInt();
                for (Account account : accounts) {
                    if (account.number == accountNumber) {
                        account.updateBalance(amount);
                        System.out.println("Amount deposited successfully!");
                        return;
                    }
                }
            }
            System.out.println("Account not found!");
        }

        private boolean isPossibleWithdraw(int accountNumber, int amount)
        {
            boolean possibleWithdraw = false;

            for(Account account : accounts)
            {
                if(account.number == accountNumber)
                {
                    int remainingBalance = account.balance - amount;

                    if (remainingBalance >= minBalanceRemainAfterWithdraw) {
                        // System.out.println("withdraw hoise");
                        // account.updateBalance(-amount);
                        return true;
                    }
                }
            }
            return possibleWithdraw;
        }



        void withdrawAmount(int accountNumber)
        {
            if(isAccountExist(accountNumber))
            {
                Scanner scanner = new Scanner(System.in);
                int amount;
                while (true) {
                    System.out.println("Enter amount to be withdrawn: ");
                    amount = scanner.nextInt();

                    if (!isPossibleWithdraw(accountNumber, amount)) {
                        System.out.println("Cannot withdraw. Minimum balance requirement not met.");
                    } else {
                        break;
                    }
                }


                for (Account account : accounts) {
                    if (account.number == accountNumber) {

                        System.out.println("Successfully withdrawn amount!\n");
                        account.updateBalance(-amount);
                        return;

                    }
                }
            }
            System.out.println("Account not found!");
        }

        void searchAccount(int accountNumber)
        {
            for (Account account : accounts) {
                if (account.number == accountNumber) {
                    System.out.println("Account found!");
                    account.display();
                    return;
                }
            }
            System.out.println("Account not found!");
        }



    }

    private static abstract class Account
    {
        String name, creationDate;
        int number, balance;
        Account(String n, int num, String date, int bal) {
            name = n;
            number = num;
            creationDate = date;
            balance = bal;
        }

        abstract void display();

        abstract void updateBalance(int amount);
    }
    private static class SavingsAccount extends Account
    {
        SavingsAccount(String n, int num, String date, int bal) {
            super(n, num, date, bal);
        }
        void display() {
            System.out.println("Savings Account - Name: " + name + ", Account Number: " + number +
                    ", Creation Date: " + creationDate + ", Balance: " + balance);
        }
        void updateBalance(int amount) {
            balance += amount;
        }
    }

    private static class SalaryAccount extends Account
    {
        SalaryAccount(String n, int num, String date, int bal) {
            super(n, num, date, bal);
        }
        void display() {
            System.out.println("Salary Account - Name: " + name + ", Account Number: " + number +
                    ", Creation Date: " + creationDate + ", Balance: " + balance);
        }
        void updateBalance(int amount) {
            balance += amount;
        }
    }

    private static class CurrentAccount extends Account
    {
        CurrentAccount(String n, int num, String date, int bal) {
            super(n, num, date, bal);
        }
        void display() {
            System.out.println("Current Account - Name: " + name + ", Account Number: " + number +
                    ", Creation Date: " + creationDate + ", Balance: " + balance);
        }
        void updateBalance(int amount) {
            balance += amount;
        }
    }
}