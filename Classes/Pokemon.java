package Classes;

public class Pokemon {

    String name;
    int level;
    // constructors - special methods that get called as soon as an object of this
    // class is instantiated ( created )
    // always has same name as that of class

    Pokemon() {
        // we want to set level to 1 for every pokemon initially
        level = 1;
    }

    Pokemon(String pName, int pLevel) {
        name = pName;
        level = pLevel;
    }

    // or you can use "this" to make it easier

    // Pokemon(String name, int level) {
    // this.name = name;
    // this.level = level;
    // }

    void attack() {
        System.out.println(name + " attack");
    }

}
