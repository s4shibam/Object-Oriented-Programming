/*
Method Overriding

It is also known as Dynamic Method Dispatch.

It is a process in which a function call to the overridden method is resolved at Runtime.

This type of polymorphism is achieved by Method Overriding.

Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.
*/

class Alpha {

    void name() {

        System.out.println("Hi! This is Alpha!");
    }

    // There is no re-definition of ability() in Beta Class
    // Though ability() get called by Beta Class reference
    // this one would get executed
    void ability() {

        System.out.println("Alpha: I know hacking!");
    }
}

// Sub Class
class Beta extends Alpha {

    // The @Override annotation denotes that the child class method overrides the
    // base class method.
    // For two reasons, the @Override annotation is useful.
    // If the annotated method does not actually override anything, the compiler
    // issues a warning.
    // It can help to make the source code more readable.

    // Alpha Class name() has been overridden by this Beta Class name()
    // While name() has been called by Beta Class reference, then Alpha class
    // name() would be neglected and this name() would get executed
    @Override
    void name() {

        System.out.println("Hi! This is Beta!");
    }
}

class Method_Overriding {
    public static void main(String[] args) {

        Beta beta = new Beta();

        beta.ability();
        beta.name();
    }
}

/*
 * Output:
 * 
 * Alpha: I know hacking!
 * Hi! This is Beta!
 */