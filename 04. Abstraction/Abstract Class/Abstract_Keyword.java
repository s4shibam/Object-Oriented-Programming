/*
Abstract Keyword (abstract)

abstract is a non-access modifier in java applicable for classes, methods but not variables. It is used to achieve abstraction which is one of the pillar of Object Oriented Programming(OOP).

Abstract classes and Abstract methods
*/

abstract class Human {

    // Concrete Class - Has Implementation
    void breathe() {
        System.out.println("Can Breathe.");
    }

    void eat() {
        System.out.println("Can Eat.");
    }

    // Abstract class - No Implementation
    abstract void hair();

    abstract void voice();

    // Abstract methods do not specify a body - cannot define an abstract method
    // abstract void bones(){}
}

// Implementation is must for Super Class Abstract Methods
// Can override Super Class implemented methods
class Man extends Human {

    void hair() {
        System.out.println("Man: Generally shorter hair, beard.");

    }

    void voice() {
        System.out.println("Man: Generally deeper voice.");

    }

}

// Implementation is must for Super Class Abstract Methods
// Can override Super Class implemented methods
class Woman extends Human {

    void hair() {
        System.out.println("Woman: Generally longer hair, no beard.");

    }

    void voice() {
        System.out.println("Woman: Generally softer voice.");

    }

}

public class Abstract_Keyword {

    public static void main(String[] args) {

        // Abstract Class can not be instantiated - Compile-time Error
        // Human obj = new Human();

        // It is possible to make abstract class reference
        Human obj1 = new Man();
        Human obj2 = new Woman();

        obj1.breathe();
        obj1.eat();
        obj1.hair();
        obj1.voice();

        System.out.println();

        obj2.breathe();
        obj2.eat();
        obj2.hair();
        obj2.voice();
    }
}

/*
 * Output:
 * 
 * Can Breathe.
 * Can Eat.
 * Man: Generally shorter hair, beard.
 * Man: Generally deeper voice.
 * 
 * Can Breathe.
 * Can Eat.
 * Woman: Generally longer hair, no beard.
 * Woman: Generally softer voice.
 */