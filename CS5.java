abstract class Plan {
    private String patientName;
    private double baseFee;

    public Plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }

    public String getPatientName() {
        return patientName;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public abstract double calculateBill();
}

class SilverPlan extends Plan {
    public SilverPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    public double calculateBill() {
        return getBaseFee() + 15;
    }
}

class GoldPlan extends Plan {
    public GoldPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    public double calculateBill() {
        double surcharge = getBaseFee() * 0.10;
        return getBaseFee() + surcharge - 20;
    }
}

class BillingMethod {
    public static void printInvoice(Plan p) {
        System.out.println(p.calculateBill());
    }
}

public class CS5 {
    public static void main(String[] args) {
        Plan p1 = new SilverPlan("John", 100.0);
        Plan p2 = new GoldPlan("Sophia", 200.0);
        Plan p3 = new GoldPlan("Max", 50.0);

        BillingMethod.printInvoice(p1);
        BillingMethod.printInvoice(p2);
        BillingMethod.printInvoice(p3);
    }
}