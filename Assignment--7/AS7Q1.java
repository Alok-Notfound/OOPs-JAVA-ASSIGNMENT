import java.lang.*;
import java.util.*;
class Employee
{
    String name;
    String job;
    double salary;

    Employee(String empName, String empJob, double empSalary)
    {
        name = empName;
        job = empJob;
        salary = empSalary;
    }

    double Calculate(int workingDays)
    {
    return (salary / 22.0) * workingDays;
    }

    void update(int workingDays)
    {
        salary=Calculate(workingDays);
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + salary);
    }
}

class AS7Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee("Alok Kumar", "Software Engineer", 50000.0);
        System.out.println("Initial Employee Details");
        emp.display();

        System.out.print("\nEnter working days: ");
        int workingDays = sc.nextInt();

        double calcSalary = emp.Calculate(workingDays);
        System.out.println("Calculated Salary for " + workingDays + " days: " + calcSalary);

        emp.update(workingDays);
        System.out.println("\nUpdated Employee Details");
        emp.display();

        sc.close();
    }
}
