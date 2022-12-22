// super is used to invoke parent class constructor - 1

// Super Class
class Alpha {

    Alpha() {

        System.out.println("Hi! This is Alpha!");

    }
}

// Sub Class
class Beta extends Alpha {

    Beta() {

        // By default calls Super Class Default Constructor
        // super(); // Can be user defined - doesn't matter

        System.out.println("Hi! This is Beta!");

    }
}

public class Super_3 {

    public static void main(String[] args) {

        // Calls default Constructor of Alpha Class
        new Alpha();

        System.out.println("----------");

        // First calls Super Class Constructor then its own
        new Beta();
    }
}

/*
 * Output:
 * 
 * Hi! This is Alpha!
 * ----------
 * Hi! This is Alpha!
 * Hi! This is Beta!
 */