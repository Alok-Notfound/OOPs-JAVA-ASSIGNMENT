import java.lang.*;
import java.util.*;

class Employee {
    String name;
    double salary;
    int hireDate;

    int yearsOfService() {
        int currentYear = 2026;
        return currentYear - hireDate;
    }
}

class AS8Q3 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter employee name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter salary: ");
        employee.salary = sc.nextDouble();

        System.out.print("Enter hire year: ");
        employee.hireDate = sc.nextInt();

        System.out.println("\nEmployee Name: " + employee.name);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Hire Year: " + employee.hireDate);
        System.out.println("Years of Service: " + employee.yearsOfService());

        sc.close();
    }
}
