/*
Try Catch Block

>> Java try block

    Java try block is used to enclose the code that might throw an exception. It must be used within the method.

    If an exception occurs at the particular statement in the try block, the rest of the block code will not execute. So, it is recommended not to keep the code in try block that will not throw an exception.

    Java try block must be followed by either catch or finally block.

>> Java catch block

    Java catch block is used to handle the Exception by declaring the type of exception within the parameter. The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type. However, the good approach is to declare the generated type of exception.

    The catch block must be used after the try block only. You can use multiple catch block with a single try block.
*/

public class Try_Catch_Block {

    public static void main(String[] args) {

        System.out.println("Let's Start!");

        try {

            int res = 100 / 0;
            System.out.println(res);

            // As soon as error occurred, it wil be caught by catch block
            // So further lines in try block will not get executed
            System.out.println("I am unreachable!");

        } catch (Exception e) {

            System.out.println("Error: " + e);

        }

        // This line will be executed after handling the error
        System.out.println("Hello World!");
    }
}

/*
 * Output:
 * 
 * Let's Start!
 * Error: java.lang.ArithmeticException: / by zero
 * Hello World!
 */