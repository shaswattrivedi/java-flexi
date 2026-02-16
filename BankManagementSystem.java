import java.util.*;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Account {
    String accountNumber;
    String accountHolder;
    double balance;

    Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
    }

    void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        withdraw(amount);
        targetAccount.deposit(amount);
        System.out.println("Transferred: " + amount);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

class Bank {
    List<Account> record = new ArrayList<>();

    void createAccount(String accountNumber, String accountHolder, double initBalance) {
        record.add(new Account(accountNumber, accountHolder, initBalance));
    }

    Account getAccount(String accountNumber) {
        for(Account a : record) {
            if(a.accountNumber.equals(accountNumber)) {
                return a;
            }
        }
        return null;
    }

    void displayAll() {
        for(Account a : record) {
            a.display();
        }
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.createAccount("182", "Shaswat", 20000);
        b.createAccount("181", "Shashank", 32000);

        try {
            Account a1 = b.getAccount("181");
            Account a2 = b.getAccount("182");
            a1.transfer(a2, 5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        b.displayAll();

    }
}

