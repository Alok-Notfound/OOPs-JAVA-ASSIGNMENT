import java.lang.*;
import java.util.*;

class Circle {
    double radius;

    void area() {
        double pi = 3.14;
        double a = pi * radius * radius;

        System.out.println("Area of Circle: " + a);
    }

    void circumference() {
        double pi = 3.14;
        double c = 2 * pi * radius;

        System.out.println("Circumference of Circle: " + c);
    }
}

class AS8Q5 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        System.out.println("Radius: " + c.radius);

        c.area();
        c.circumference();

        System.out.print("Enter new radius: ");
        c.radius = sc.nextDouble();

        System.out.println("Modified Radius: " + c.radius);

        c.area();
        c.circumference();

        sc.close();
    }
}