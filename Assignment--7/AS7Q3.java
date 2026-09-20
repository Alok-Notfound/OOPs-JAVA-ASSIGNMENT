import java.lang.*;
import java.util.*;

class Area {
    static double rectArea(double l, double b) {
        return l * b;
    }

    double sqArea(double s) {
        return s * s;
    }
}

class AS7Q3 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        double ra = Area.rectArea(l, b);
        System.out.println("Area of Rectangle: " + ra);

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();

        Area ar = new Area();
        double sa = ar.sqArea(s);
        System.out.println("Area of Square: " + sa);

        sc.close();
    }
}