// super is used to invoke parent class constructor - 2

// Super Class
class Alpha {

    Alpha() {

        System.out.print("Default Alpha: ");
        System.out.println("Hi! This is Alpha!");

    }

    Alpha(int v) {

        System.out.print("Parameterized Alpha: ");
        System.out.println("Hello! This is Alpha Version " + v + "!");

    }
}

// Sub Class
class Beta extends Alpha {

    Beta() {

        // By default calls Super Class Default Constructor
        // Can be user defined - doesn't matter
        super();

        System.out.print("Default Beta: ");
        System.out.println("Hi! This is Beta!");

    }

    Beta(int v) {

        // By default calls Super Class Default Constructor
        // Can be user defined - doesn't matter
        // super();

        System.out.print("Parameterized Beta: ");
        System.out.println("Hello! This is Beta Version " + v + "!");

    }
}

// Sub Class
class Delta extends Alpha {

    Delta() {

        // By default calls Super Class Default Constructor
        // Can be user defined - doesn't matter
        super();

        System.out.print("Default Delta: ");
        System.out.println("Hi! This is Delta!");

    }

    Delta(int v) {

        // By default calls Super Class Default Constructor
        // Can be user defined - doesn't matter
        // super();

        // This will call Super Class Parametrized Constructor over Default Constructor
        super(v);

        System.out.print("Parameterized Delta: ");
        System.out.println("Hello! This is Delta Version " + v + "!");

    }
}

public class Super_4 {

    public static void main(String[] args) {

        // Calls default Constructor of Alpha Class
        new Alpha();

        System.out.println("----------");

        // First calls Super Class Default Constructor then its own Default Constructor
        new Beta();

        System.out.println("----------");

        // First calls Super Class Default Constructor then
        // its own Parameterized Constructor
        new Beta(2);

        System.out.println("----------");

        // First calls Super Class Parameterized Constructor then
        // its own Parameterized Constructor
        new Delta(5);
    }
}

// Note: Cannot call super() 2 Times in a single method.

/*
 * Output:
 * 
 * Default Alpha: Hi! This is Alpha!
 * ----------
 * Default Alpha: Hi! This is Alpha!
 * Default Beta: Hi! This is Beta!
 * ----------
 * Default Alpha: Hi! This is Alpha!
 * Parameterized Beta: Hello! This is Beta Version 2!
 * ----------
 * Parameterized Alpha: Hello! This is Alpha Version 5!
 * Parameterized Delta: Hello! This is Delta Version 5!
 */