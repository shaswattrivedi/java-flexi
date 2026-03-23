abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double processPayment();
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    public double processPayment() {
        return getAmount() * 1.02;
    }
}

class UPIPayment extends Payment {
    public UPIPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    public double processPayment() {
        if (getTransactionId().length() != 10) {
            throw new IllegalArgumentException();
        }
        return getAmount();
    }
}

class PaymentProcessor {
    public double process(Payment p) {
        return p.processPayment();
    }
}

public class CS1 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("TXN1234567", 1000.0);
        Payment p2 = new UPIPayment("1234567890", 1000.0);

        PaymentProcessor processor = new PaymentProcessor();

        double result1 = processor.process(p1);
        double result2 = processor.process(p2);

        System.out.println(result1);
        System.out.println(result2);

        Payment[] payments = {p1, p2};
        double total = 0;

        for (Payment p : payments) {
            total += processor.process(p);
        }

        System.out.println("Total: " + total);
    }
}