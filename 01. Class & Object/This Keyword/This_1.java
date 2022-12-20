// The this keyword can be used to refer current class instance variable.
// If there is ambiguity between the instance variables and parameters this keyword resolves the problem of ambiguity.

class This {

    int n1, n2;

    This(int n1, int n2) {

        // this.n1 -> refers to current class instance variable
        // n1 -> refers to parameter
        this.n1 = n1;

        // this.n2 -> refers to current class instance variable
        // n2 -> refers to parameter
        this.n2 = n2;
    }

    void print() {

        System.out.printf("This_1: Addition: %d + %d = %d\n", n1, n2, n1 + n2);
    }
}

public class This_1 {

    public static void main(String[] args) {

        This t = new This(10, 15);
        t.print();
    }
}

/*
 * Output:
 * 
 * This_1: Addition: 10 + 15 = 25
 */