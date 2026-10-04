class Counter {
    static int cnt = 0;
    int id;

    static {
        System.out.println("Static block: Counter class loaded.");
    }

    Counter() {
        cnt++;
        id = cnt;
    }

    static void show() {
        System.out.println("Total objects created: " + cnt);
    }

    static class Helper {
        void msg() {
            System.out.println("Hello from static nested class.");
        }
    }
}

public class AS10Q4 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("c1 id = " + c1.id);
        System.out.println("c2 id = " + c2.id);
        System.out.println("c3 id = " + c3.id);

        Counter.show();

        Counter.Helper h = new Counter.Helper();
        h.msg();
    }
}