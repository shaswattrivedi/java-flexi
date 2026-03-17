class Account {
    double balance;
    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return (this.balance * 0.02);
    }
}

class SavingsAccount extends Account {
    double OverBalance;
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        OverBalance = balance * 0.04;
        if (balance > 50000) {
            OverBalance += 500;
        }
        return OverBalance;
    }
}

class FixedDeposit extends SavingsAccount {
    double FixedInterest;
    public FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        FixedInterest = super.calculateInterest() + (balance * 0.02);
        return FixedInterest;
    }
}

public class InheritanceCS {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(10000);
        System.out.println("Account 1: " + a1.calculateInterest());

        Account a2 = new SavingsAccount(60000);
        System.out.println("Account 2: " + a2.calculateInterest());
        
        Account a3 = new FixedDeposit(60000);
        System.out.println("Account 3: " + a3.calculateInterest());
    }
}