/*
Single Level Inheritance

When a class inherits another class, it is known as a single inheritance.
*/

// Super / Parent / Base Class 
class Bird {

    void fly() {

        System.out.println("I can fly!");
    }
}

// Sub / Child / Derived Class
class Parrot extends Bird {

    Parrot() {
        System.out.println("Hi! I am Parrot!");
    }

    void talk() {

        System.out.println("I can talk!");
    }
}

public class Single_Level_Inheritance {
    public static void main(String[] args) {

        // Child class reference
        Parrot p = new Parrot();

        p.fly(); // Parent class method calling - Inherited
        p.talk(); // Child class method calling - Own
    }
}

/*
 * Output:
 * 
 * Hi! I am Parrot!
 * I can fly!
 * I can talk!
 */