import java.lang.*;
import java.util.*;

class Student {
    String n;
    int r;
    String c;

    Student(String sName, int sRoll) {
        n = sName;
        r = sRoll;
        c = "None";
    }

    void selectCourse(int ch) {
        switch (ch) {
            case 1:
                c = "CSE";
                break;
            case 2:
                c = "CSEAIML";
                break;
            case 3:
                c = "CSEDS";
                break;
            case 4:
                c = "CSEIOT";
                break;
            default:
                c = "Invalid Option";
                break;
        }
    }

    void display() {
        System.out.println("Name: " + n);
        System.out.println("Roll No: " + r);
        System.out.println("Course: " + c);
    }
}

class AS7Q2 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        Student st = new Student(n, r);

        System.out.println("\n1. CSE\n2. CSEAIML\n3. CSEDS\n4. CSEIOT");
        System.out.print("Select Option (1-4): ");
        int ch = sc.nextInt();

        st.selectCourse(ch);

        System.out.println("\n--- Details ---");
        st.display();

        sc.close();
    }
}