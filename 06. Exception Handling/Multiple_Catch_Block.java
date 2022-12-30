/*
Java Multi-catch block

A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler. So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.
*/
public class Multiple_Catch_Block {

    public static void main(String[] args) {

        int arr[] = new int[5];

        // Error 1
        try {

            arr[10] = 2023 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Error 1: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error 2: " + e);

        }

        // Error 2
        try {

            arr[10] = 500;

        } catch (ArithmeticException e) {

            System.out.println("Error 1: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error 2: " + e);

        }

        // Short Hand Multiple Catch Block ( | works as 'or')
        try {

            arr[10] = 500 / 0;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.out.println("Error 1: " + e);
        }
    }
}

/*
 * Output:
 * 
 * Error 1: java.lang.ArithmeticException: / by zero
 * Error 2: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
 * Error 1: java.lang.ArithmeticException: / by zero
 */