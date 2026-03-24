abstract class Robot {
    private String batteryId;
    protected double chargeLevel;

    public Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public void reportStatus() {
        System.out.println("Charge: " + chargeLevel + "%");
    }

    public abstract void performTask();
}

class DroneRobot extends Robot {
    public DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    public void performTask() {
        if (chargeLevel < 15) {
            System.out.println("Low battery!");
        } else {
            chargeLevel -= 15;
            if (chargeLevel < 0) chargeLevel = 0;
            reportStatus();
        }
    }
}

class GroundRobot extends Robot {
    public GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    public void performTask() {
        if (chargeLevel < 5) {
            System.out.println("Low battery!");
        } else {
            System.out.println("Performing surface check...");
            chargeLevel -= 5;
            if (chargeLevel < 0) chargeLevel = 0;
            reportStatus();
        }
    }
}

public class CS6 {
    public static void main(String[] args) {
        Robot r1 = new DroneRobot("D-1", 20.0);
        r1.performTask();

        Robot r2 = new GroundRobot("G-5", 10.0);
        r2.performTask();

        Robot r3 = new DroneRobot("D-2", 10.0);
        r3.performTask();

        Robot[] fleet = {
            new DroneRobot("D1", 50),
            new GroundRobot("G1", 50)
        };

        for (Robot r : fleet) {
            r.performTask();
        }
    }
}