class Payment {
    void processPayment() {
        System.out.println("Payment Processed Succesfully!");
    }
}

class CreditCard extends Payment {
    String cardno;
    int cvv;
    CreditCard(String cardno, int cvv) {
        this.cardno = cardno;
        this.cvv = cvv;
    }

    @Override

    void processPayment() {
        System.out.println("Credit Card Details:-");
        System.out.println("Card Number: " + cardno);
        System.out.println("CVV: " + cvv);
        System.out.println("Payment Processed Successfully!");
    }
}

class BankTransfer extends Payment {
    String accno;
    String ifsc;
    BankTransfer(String accno, String ifsc) {
        this.accno = accno;
        this.ifsc = ifsc;
    }

    @Override

    void processPayment() {
        System.out.println("Bank Transfer Details:-");
        System.out.println("Bank Account Number: " + accno);
        System.out.println("IFSC Code: " + ifsc);
        System.out.println("Payment Processed Successfully!");
    }
}

class UpiTransfer extends Payment {
    String upiID;
    UpiTransfer(String upiID) {
        this.upiID = upiID;
    }

    @Override 

    void processPayment() {
        System.out.println("UPI Transfer Details:-");
        System.out.println("UPI ID: " + upiID);
        System.out.println("Payment Processed Successfully!");
    }
}

public class Payments {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard("1234-5678-9101-1121", 566);
        p.processPayment();

        System.out.println();

        p = new BankTransfer("9876543210", "SBIN0001234");
        p.processPayment();

        System.out.println();

        p = new UpiTransfer("shaswattriv@upi");
        p.processPayment();
    }
}