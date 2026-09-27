class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    double fuelUsed;
    double distance;

    Vehicle(String m, String mo, int y, String f, double fu, double d) {
        make = m;
        model = mo;
        year = y;
        fuelType = f;
        fuelUsed = fu;
        distance = d;
    }

    double calculateMileage() {
        return distance / fuelUsed;
    }

    double calculateDistanceTraveled() {
        return distance;
    }

    double calculateMaxSpeed() {
        return 0;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + calculateMileage() + " km/l");
        System.out.println("Distance Travelled: " + calculateDistanceTraveled() + " km");
        System.out.println("Maximum Speed: " + calculateMaxSpeed() + " km/h");
    }
}

class Truck extends Vehicle {

    Truck(String m, String mo, int y, String f, double fu, double d) {
        super(m, mo, y, f, fu, d);
    }

    double calculateMaxSpeed() {
        return 100;
    }
}

class Car extends Vehicle {

    Car(String m, String mo, int y, String f, double fu, double d) {
        super(m, mo, y, f, fu, d);
    }

    double calculateMaxSpeed() {
        return 180;
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String m, String mo, int y, String f, double fu, double d) {
        super(m, mo, y, f, fu, d);
    }

    double calculateMaxSpeed() {
        return 150;
    }
}

class AS9Q5 {
    public static void main(String args[]) {

        Truck t = new Truck("Tata", "Prima", 2022, "Diesel", 50, 300);
        Car c = new Car("Toyota", "Camry", 2023, "Petrol", 20, 300);
        Motorcycle m = new Motorcycle("Honda", "Shine", 2024, "Petrol", 10, 500);

        System.out.println("----- TRUCK -----");
        t.display();

        System.out.println("\n----- CAR -----");
        c.display();

        System.out.println("\n----- MOTORCYCLE -----");
        m.display();
    }
}