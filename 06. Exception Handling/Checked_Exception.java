/*
Checked Exceptions

Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.

*/

import java.io.*;

public class Checked_Exception {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");

        // Compile-time Error: Unhandled exception type IOException
        // Can be handled using throws IOException or using try-catch block
        int num = Integer.parseInt(br.readLine());
        System.out.println("Number is: " + num);
    }
}

/*
 * Output:
 * 
 * Enter a number:
 * 7
 * Number is: 7
 */