package week6;

class VehicleDetails {
    String vehicleNumber;
    String brand;
    double speed;

    VehicleDetails(String vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends VehicleDetails {
    int numberOfDoors;

    Car(String vehicleNumber, String brand, double speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends VehicleDetails {
    boolean hasGear;

    Bike(String vehicleNumber, String brand, double speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Vehicle {
    public static void main(String[] args) {

        VehicleDetails v;

        v = new Car("TN01AB1234", "Toyota", 120, 4);
        v.displayDetails();

        System.out.println();

        v = new Bike("TN02CD5678", "Yamaha", 100, true);
        v.displayDetails();
    }
}