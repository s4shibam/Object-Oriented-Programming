/*
Dynamic Method Dispatch / Runtime polymorphism

Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

*/

class Alpha {

    void name() {

        System.out.println("Hi! This is Alpha!");
    }

    void ability() {

        System.out.println("Alpha: I know hacking!");
    }
}

// Sub Class
class Beta extends Alpha {

    // Method Overriding
    @Override
    void name() {

        System.out.println("Hi! This is Beta!");
    }
}

// Sub Class
class Gamma extends Alpha {

    // Method Overriding
    @Override
    void name() {

        System.out.println("Hi! This is Gamma!");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        // Reference of Alpha & Object of Beta
        Alpha obj = new Beta();

        // Calls Alpha Class ability() as there is no redefinition of it in Beta Class
        obj.ability();

        // Runtime Polymorphism
        // Calls Beta Class name() as it has been overridden
        obj.name();

        // Same reference of Alpha & Object of Gamma
        obj = new Gamma();

        // Runtime Polymorphism
        // Calls Gamma Class name() as it has been called though object of Gamma
        obj.name();

        // Since, changing the object calls the different method,
        // So, this method changing concept known as Dynamic Method Dispatch
    }
}

/*
 * Output:
 * 
 * Alpha: I know hacking!
 * Hi! This is Beta!
 * Hi! This is Gamma!
 */