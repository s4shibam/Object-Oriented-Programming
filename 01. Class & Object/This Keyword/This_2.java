// The this keyword can be used to invoke the method of the current class by using the this keyword.
// If this keyword is no used, compiler automatically adds this keyword while invoking the method.

class This {

    void print() {
        System.out.println("This_2: In This_2 Class.");
        // this as current class
        this.anotherMethod(); // Method invoked
    }

    void anotherMethod() {

        System.out.println("This_2: Invoked current class method!");
    }

}

public class This_2 {

    public static void main(String[] args) {

        This t = new This();
        t.print();
    }
}

/*
 * Output:
 * 
 * This_2: In This_2 Class.
 * This_2: Invoked current class method
 */