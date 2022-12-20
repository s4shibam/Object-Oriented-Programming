class Default {

    // Default Constructor
    Default() {

        System.out.println("This is Default Constructor!");
    }
}

class Parametrized {

    // Parametrized Constructor
    Parametrized(int year) {

        System.out.println("This is Parameterized Constructor!");
        System.out.println("Happy New Year " + year);
    }
}

class Copy {

    String name;
    int age;

    // Default Constructor
    Copy(String n, int a) {

        System.out.println("This is Default Constructor!");
        name = n;
        age = a;
    }

    // Copy Constructor
    // Constructor to initialize another object
    Copy(Copy c) {

        System.out.println("This is Copy Constructor!");
        name = c.name;
        age = c.age;
    }

    void print() {

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

    }
}

public class Constructor {

    public static void main(String[] args) {

        new Default(); // Default Constructor
        System.out.println();

        new Parametrized(2023); // Parameterized Constructor
        System.out.println();

        Copy copy1 = new Copy("Shibam", 20); // Default Constructor
        Copy copy2 = new Copy(copy1); // Copy Constructor

        System.out.println("\nPrint data:");
        copy1.print();
        copy2.print();

    }
}

/*
 * Output:
 * 
 * This is Default Constructor!
 * 
 * This is Parameterized Constructor!
 * Happy New Year 2023
 * 
 * This is Default Constructor!
 * This is Copy Constructor!
 * 
 * Print data:
 * Name is: Shibam
 * Age is: 20
 * Name is: Shibam
 * Age is: 20
 */