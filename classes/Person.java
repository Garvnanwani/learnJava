package classes;

abstract class Person {
    String name;
    int age;

    Person() {
        System.out.println("constructor of parent");
    }

    abstract void walk();

    void eat() {
        System.out.println("Eating");
    }
}

// Person p5 = new Person();

class Developer extends Person {

    Developer() {
        super();
    }

    @Override
    void walk() {
        System.out.println("Developer Walking");
    }

    void eat() {
        System.out.println("Develoepr Is Eating");
    }
}

class Manager extends Person {
    @Override
    void walk() {
        System.out.println("Manager Walking");
    }
}

// Car

// - maruti - class
// - alto - class
// - tata - class
