import java.lang.*;
import java.util.*;

class Library {
    int bookNo[] = new int[10];
    String bookName[] = new String[10];
    String author[] = new String[10];

    int n = 0;

    void addBook(int no, String name, String a) {
        bookNo[n] = no;
        bookName[n] = name;
        author[n] = a;
        n++;

        System.out.println("Book added");
    }

    void removeBook(int no) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (bookNo[i] == no) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < n - 1; i++) {
                bookNo[i] = bookNo[i + 1];
                bookName[i] = bookName[i + 1];
                author[i] = author[i + 1];
            }

            n--;
            System.out.println("Book removed");
        } else {
            System.out.println("Book not found");
        }
    }

    void display() {
        System.out.println("Books:");

        for (int i = 0; i < n; i++) {
            System.out.println(bookNo[i] + "  " + bookName[i] + "  " + author[i]);
        }
    }
}

class AS7Q5 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        int ch;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter book no: ");
                int no = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter book name: ");
                String name = sc.nextLine();

                System.out.print("Enter author: ");
                String a = sc.nextLine();

                lib.addBook(no, name, a);
            }

            else if (ch == 2) {
                System.out.print("Enter book no to remove: ");
                int no = sc.nextInt();

                lib.removeBook(no);
            }

            else if (ch == 3) {
                lib.display();
            }

            else if (ch == 4) {
                System.out.println("Program ended");
            }

            else {
                System.out.println("Invalid choice");
            }

        } while (ch != 4);

        sc.close();
    }
}