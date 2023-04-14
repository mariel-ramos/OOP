public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    public String getbrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}


public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void start() {
        System.out.println("Starting the car");
    }

    public void accelerate() {
        System.out.println("Accelerating the car");
    }

    public void brake() {
        System.out.println("Applying the brakes");
    }

    public void stop() {
        System.out.println("Stopping the car");
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getBrand() {
        return null;
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2021, 4);
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Number of doors: " + myCar.getNumDoors());
    }
}
