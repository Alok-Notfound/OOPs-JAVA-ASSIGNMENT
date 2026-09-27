import java.util.*;

class Person {
    String firstName;
    String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    int employeeID;
    String jobTitle;

    int getEmployeeID() {
        return employeeID;
    }

    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
}

class AS9Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter first name: ");
        e.firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        e.lastName = sc.nextLine();

        System.out.print("Enter employee ID: ");
        e.employeeID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter job title: ");
        e.jobTitle = sc.nextLine();

        System.out.println("\nFirst Name: " + e.getFirstName());
        System.out.println("Last Name: " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeID());

        sc.close();
    }
}