class Vehicle {
    void drive() {
        System.out.println("Driving a Vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a Car");
    }
}

class AS9Q1 {
    public static void main(String args[]) {
        Car c = new Car();
        c.drive();
    }
}