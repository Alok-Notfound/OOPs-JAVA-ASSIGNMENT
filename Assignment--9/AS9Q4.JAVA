import java.util.*;

class Shape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class AS9Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);

        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Perimeter of Circle: " + c.getPerimeter());

        sc.close();
    }
}