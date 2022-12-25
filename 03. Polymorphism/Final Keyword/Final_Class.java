/*
Java Final Class

If you make any class as final, you cannot extend it.
*/

final class Unique {

    Unique() {

        System.out.println("I am Unique!");
    }
}

// Compile-time Error
class Normal extends Unique {

    Normal() {

        System.out.println("I am Normal!");
    }
}

public class Final_Class {

    public static void main(String[] args) {

        new Normal();

    }
}

/*
 * Output:
 * 
 * Final_Class.java:15: error: cannot inherit from final Unique
 * class Normal extends Unique {
 *                      ^
 * 1 error
 */