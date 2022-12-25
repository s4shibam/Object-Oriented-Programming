/*
Functional Interface / Lambda expression

Lambda Expression
It replaces all the boiler plate code from java with "->". 
*/

// @FunctionalInterface --> Gives compile-time error if more than 1 method is declared in a functional interface
@FunctionalInterface
interface Quote {
    void show();

    // Compile-time error
    // void method();
}

public class Functional_Interface {

    public static void main(String[] args) {

        // Single line Lambda Expression
        Quote quote = () -> System.out.println("Declare variables, not war!");

        // Above code is the replacement of ...
        /*
         * 
         * Quote quote = new Quote() {
         * public void show() {
         * 
         * System.out.println("Declare variables, not war!");
         * }
         * };
         * 
         */

        quote.show();

        System.out.println();

        // Multi line Lambda Expression

        quote = () -> {

            for (int i = 0; i < 3; i++)
                System.out.println("I hate programming!");

            System.out.println("It works!");
            System.out.println("I love programming!");
        };

        quote.show();
    }
}

/*
 * Output:
 * 
 * Declare variables, not war!
 * 
 * I hate programming!
 * I hate programming!
 * I hate programming!
 * It works!
 * I love programming!
 */