interface Walker {
    default void move() {
        System.out.println("Walking...");
    }
}

interface Swimmer {
    default void move() {
        System.out.println("Swimming...");
    }
}

class Duck implements Walker, Swimmer {
    public void move() {
        Walker.super.move();
        Swimmer.super.move();
    }
}

public class AS10Q2 {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        d1.move();
    }
}