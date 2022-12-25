/*
Final Variable

If you make any variable as final, you cannot change the value of final variable(It will be constant).
*/

public class Final_Variable {

    public static void main(String[] args) {

        final double PI = 3.141592653589793238;

        // The final local variable adultAge cannot be assigned
        // Non changeable - Constant;
        // PI = 4.5;

        // If not initialized while declaration
        // Then it can be initialized in future but for 1 time
        final int year;
        year = 1947;

        // Compile-time Error
        // year = 2022;

        System.out.println(PI);
        System.out.println(year);

    }
}

/*
 * Output:
 * 
 * 3.141592653589793238
 * 1947
 */