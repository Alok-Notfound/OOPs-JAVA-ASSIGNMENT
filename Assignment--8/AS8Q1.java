import java.lang.*;

class Person {
    String name;
    int age;
}

class AS8Q1 {
    public static void main(String SCP[]) {

        final String name1 = "Aalok";
        final int age1 = 20;

        final String name2 = "Rahul";
        final int age2 = 21;

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = name1;
        person1.age = age1;

        person2.name = name2;
        person2.age = age2;

        System.out.println("Person 1 Name: " + person1.name);
        System.out.println("Person 1 Age: " + person1.age);

        System.out.println("Person 2 Name: " + person2.name);
        System.out.println("Person 2 Age: " + person2.age);
    }
}