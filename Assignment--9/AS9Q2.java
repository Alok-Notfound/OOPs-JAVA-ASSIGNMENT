import java.util.*;

class Account {
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Amount withdrawn: " + amount);
    }
}

class SavingAccount extends Account {
    void withdraw(int amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied!");
            System.out.println("Balance cannot fall below 100.");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        }
    }
}

class AS9Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        SavingAccount s = new SavingAccount();

        System.out.print("Enter starting balance: ");
        s.balance = sc.nextInt();

        System.out.print("Enter deposit amount: ");
        int d = sc.nextInt();
        s.deposit(d);

        System.out.print("Enter withdraw amount: ");
        int w = sc.nextInt();
        s.withdraw(w);

        System.out.println("Current Balance: " + s.balance);

        System.out.print("Enter another withdraw amount: ");
        int w2 = sc.nextInt();
        s.withdraw(w2);

        sc.close();
    }
}