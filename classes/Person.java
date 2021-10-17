package classes;

abstract class Person {
    String name;
    int age;

    abstract void walk();

    void eat() {
        System.out.println("Eating");
    }
}

// Person p5 = new Person();

class Developer extends Person {

    @Override
    void walk() {
        System.out.println("Developer Walking");
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
