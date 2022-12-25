/*
Default Method

Like regular interface methods, default methods are implicitly public; there's no need to specify the public modifier.

Unlike regular interface methods, we declare them with the default keyword at the beginning of the method signature, and they provide an implementation.
*/

// This can also be a Functional Interface till it has only 1 Abstract Method and any number of Default Methods
@FunctionalInterface
interface Sigma {

    // Needs implementation
    void show();

    // Implemented a method in an Interface
    // No need of implementation where the interface has been implemented
    // This can be overrode too 
    default void defaultMethod() {

        System.out.println("Hey! I am in a Default Method!");
    }
}

class Implementor implements Sigma {

    public void show() {

        System.out.println("Sigma: Implemented in Implementor Class!");
    }
}

public class Default_Method {

    public static void main(String[] args) {

        Sigma sigma = new Implementor();

        sigma.show();
        sigma.defaultMethod();
    }
}

/*
 * Output:
 * 
 * Sigma: Implemented in Implementor Class!
 * Hey! I am in a Default Method!
 */