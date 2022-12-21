/*
Multilevel Inheritance

When there is a chain of inheritance, it is known as multilevel inheritance.
*/

import java.util.*;

// *Input class is the Parent class
class Input {

    int num1, num2;

    void input_action() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st & 2nd Number = ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println();
        sc.close();
    }
}

// *All details of Input class inherited to Addition class
class Addition extends Input {

    int sum;

    void addition_action() {

        sum = num1 + num2;
    }
}

// *All details of Addition class inherited to Subtraction class
class Subtraction extends Addition {

    int sub;

    void subtraction_action() {

        sub = num1 - num2;
    }
}

// *All details of Subtraction class inherited to Multiplication class
class Multiplication extends Subtraction {

    int mul;

    void multiplication_action() {

        mul = num1 * num2;
    }
}

// *All details of Multiplication class inherited to Division class
class Division extends Multiplication {

    int div;

    void division_action() {

        div = num1 / num2;

    }
}

// *All details of division class inherited to Output class
class Output extends Division {

    void output_action() {

        System.out.printf("Addition:       (%d + %d) = %d\n", num1, num2, sum);
        System.out.printf("Subtraction:    (%d - %d) = %d\n", num1, num2, sub);
        System.out.printf("Multiplication: (%d * %d) = %d\n", num1, num2, mul);
        System.out.printf("Division:       (%d / %d) = %d\n", num1, num2, div);
    }
}

public class Multi_Level_Inheritance {

    public static void main(String[] args) {

        System.out.println("MULTI LEVEL INHERITANCE - CALCULATOR");
        System.out.println("------------------------------------");

        Output out = new Output();
        out.input_action();
        out.addition_action();
        out.subtraction_action();
        out.multiplication_action();
        out.division_action();
        out.output_action();
    }
}

/*
 * Output:
 * MULTI LEVEL INHERITANCE - CALCULATOR
 * ------------------------------------
 * Enter 1st & 2nd Number = 50 25
 * 
 * Addition: (50 + 25) = 75
 * Subtraction: (50 - 25) = 25
 * Multiplication: (50 * 25) = 1250
 * Division: (50 / 25) = 2
 */