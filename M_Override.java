class BankAccount {
    double getInterestRate() {
        return 0.0;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 4.5;
    }
}

class CurrentAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 3.0;
    }
}

public class M_Override {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount();
        BankAccount ca = new CurrentAccount();
        System.out.println("Savings Interest Rate: " + sa.getInterestRate());
        System.out.println("Current Interest Rate: " + ca.getInterestRate());
    }
}