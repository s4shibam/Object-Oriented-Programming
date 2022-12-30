/*
Java Finally Block

    Java finally block is a block used to execute important code such as closing the connection, etc.

    Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

    The finally block follows the try-catch block.
*/
public class Finally_Block {

    public static void main(String[] args) {

        // Error
        try {

            System.out.println("Answer: " + (38 / 0));

        } catch (Exception e) {

            System.out.println("Error: " + e);

        } finally {

            System.out.println("I am always reachable!");
        }

        // No Error
        try {

            System.out.println("Answer: " + (38 / 19));

        } catch (Exception e) {

            System.out.println("Error: " + e);

        } finally {

            System.out.println("I am always reachable!");
        }
    }
}

/*
 * Output:
 * 
 * Error: java.lang.ArithmeticException: / by zero
 * I am always reachable!
 * Answer: 2
 * I am always reachable!
 */