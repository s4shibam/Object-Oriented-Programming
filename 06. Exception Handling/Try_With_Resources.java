/*
Try with Resources 

This allows to declare resources to be used in a try block with the assurance that the resources will be closed after the execution of that block.

The resources declared need to implement the AutoCloseable interface.

The simple and obvious way to use the new try-with-resources functionality is to replace the traditional and verbose try-catch-finally block.
*/

import java.io.*;

public class Try_With_Resources {

    public static void main(String[] args) throws IOException {

        int num;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter a number: ");
            num = Integer.parseInt(br.readLine());
        }

        System.out.println("Number is: " + num);

    }
}

/*
 * Output:
 * 
 * Enter a number:
 * 1
 * Number is: 1
 */