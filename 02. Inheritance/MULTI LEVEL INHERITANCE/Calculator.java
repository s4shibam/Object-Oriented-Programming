// MULTI LEVEL INHERITANCE

import java.util.*;

// *input class is the parent class
class input {

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

// *All details of input class inherited to addition class
class addition extends input {

    int sum;

    void addition_action() {

        sum = num1 + num2;
    }
}

// *All details of addition class inherited to subtraction class
class subtraction extends addition {

    int sub;

    void subtraction_action() {

        sub = num1 - num2;
    }
}

// *All details of subtraction class inherited to multiplication class
class multiplication extends subtraction {

    int mul;

    void multiplication_action() {

        mul = num1 * num2;
    }
}

// *All details of multiplication class inherited to division class
class division extends multiplication {

    int div;

    void division_action() {

        div = num1 / num2;

    }
}

// *All details of division class inherited to Output class
class output extends division {

    void output_action() {

        System.out.printf("Addition:       (%d + %d) = %d\n", num1, num2, sum);
        System.out.printf("Subtraction:    (%d - %d) = %d\n", num1, num2, sub);
        System.out.printf("Multiplication: (%d * %d) = %d\n", num1, num2, mul);
        System.out.printf("Division:       (%d / %d) = %d\n", num1, num2, div);
    }
}

public class Calculator {

    public static void main(String[] args) {

        System.out.println("MULTI LEVEL INHERITANCE - CALCULATOR");
        System.out.println("------------------------------------");

        output output = new output();
        output.input_action();
        output.addition_action();
        output.subtraction_action();
        output.multiplication_action();
        output.division_action();
        output.output_action();
    }
}
