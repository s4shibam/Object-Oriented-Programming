import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String str) {

        // Calls Exception Class Parameterized Constructor
        // Then, It Calls Throwable Class Parameterized Constructor
        // Then the message is printed
        super(str);

    }
}

public class User_Defined_Exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.close();

        try {

            if (age < -100)
                throw new InvalidAgeException("You are dumb!");

            if (age < 0)
                throw new InvalidAgeException("Age less than 0 is impossible!");

        } catch (Exception e) {

            System.out.println("Ohh my God! Error: " + e);
        }

    }
}

/*
 * Output 1:
 * 
 * Enter age: -12
 * Ohh my God! Error: InvalidAgeException: Age less than 0 is impossible!
 */

/*
 * Output 2:
 * 
 * Enter age: -200
 * Ohh my God! Error: InvalidAgeException: You are dumb!
 */