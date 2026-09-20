import java.lang.*;
import java.util.*;

class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

class AS8Q2{
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Enter height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());

        sc.close();
    }
}
