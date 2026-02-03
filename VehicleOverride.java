import java.util.Scanner;

class Vehicle {
    int topspeed;
    public Vehicle() {
        setTopSpeed();
    }
    public void setTopSpeed() {
        topspeed = 60;
    }
}

class Car extends Vehicle {
    public Car() {
        setTopSpeed();
    }
    public void setTopSpeed() {
        topspeed = 100;
    }
}

class Bike extends Vehicle {
    public Bike() {
        setTopSpeed();
    }
    public void setTopSpeed() {
        topspeed = 80;
    }
}

public class VehicleOverride {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Speed: ");
        int speed = sc.nextInt();
        System.out.println("What are you driving? Car(1) or Bike(2) ");
        int choice = sc.nextInt();
        Vehicle obj;
        switch(choice) {
            case 1:
                obj = new Car();
                if(speed > obj.topspeed) {
                    System.out.println("You are Overspeeding");
                }
                else {
                    System.out.println("You are driving within the Speed Limit");
                }
                break;
            
            case 2:
                obj = new Bike();
                if(speed > obj.topspeed) {
                    System.out.println("You are overspeeding");
                } else {
                    System.out.println("You are driving within the Speed Limit");
                }
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}