/*
Unchecked Exceptions

The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.
*/
public class Unchecked_Exception {

    public static void main(String[] args) {

        // Undetectable in Compile-time
        int result = 100 / 0;
        System.out.println(result);

        // This part will never be executed
        System.out.println("Hello World!");
    }
}

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Unchecked_Exception.main(Unchecked_Exception.java:11)
 */