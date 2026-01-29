class Vehicle {
    public void start()
    {
        System.out.println("Starting Vehicle");
    }
    public void stop()
    {
        System.out.println("Stopping Vehicle");
    }
}
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key ignition");
    }

    public void fuelType() {
        System.out.println("Fuel Type: Petrol");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with self or kick");
    }

    public void gearType() {
        System.out.println("Gear Type: Manual");
    }
}
public class VehicleHierarchy {
    public static void main(String[] args) {
       Car car = new Car();
       Bike bike = new Bike();
       car.start();
       car.fuelType();
       car.stop();
       bike.start();
       bike.gearType();
       bike.stop();


    }
}
