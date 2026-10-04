class A {
    void ma() {
        System.out.println("Method of class A");
    }
}

class B extends A {
    void mb() {
        System.out.println("Method of class B");
    }
}

class C extends B {
    void mc() {
        System.out.println("Method of class C");
    }
}

interface D {
    void md();
}

class E extends C implements D {
    public void md() {
        System.out.println("Method of interface D");
    }
}

public class AS10Q5 {
    public static void main(String[] args) {
        E e1 = new E();

        e1.ma();
        e1.mb();
        e1.mc();
        e1.md();
    }
}