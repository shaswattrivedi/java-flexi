import java.util.*;

abstract class Transport {
    protected String trackingId;
    protected String destination;

    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    public abstract void dispatch();
}

interface GPS {
    String getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class Truck extends Transport {
    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Truck " + trackingId + " heading to " + destination);
    }
}

class CargoShip extends Transport {
    public CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Cargo Ship " + trackingId + " sailing to " + destination);
    }
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    public String getCoordinates() {
        return "40.7128° N";
    }

    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

public class CS3 {
    public static void main(String[] args) {
        Transport t = new DeliveryDrone("D101", "City Center");
        t.dispatch();

        GPS g = new DeliveryDrone("D101", "City Center");
        System.out.println(g.getCoordinates());

        Transport t2 = new Truck("T202", "Warehouse");

        if (t instanceof GPS) {
            System.out.println("True for Drone");
        } else {
            System.out.println("False for Truck");
        }

        if (t2 instanceof GPS) {
            System.out.println("True for Drone");
        } else {
            System.out.println("False for Truck");
        }

        List<Transport> list = new ArrayList<>();
        list.add(new DeliveryDrone("D101", "City Center"));
        list.add(new Truck("T202", "Warehouse"));
        list.add(new CargoShip("S303", "Port"));

        for (Transport tr : list) {
            tr.dispatch();
        }
    }
}