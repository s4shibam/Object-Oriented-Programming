// The this() constructor call can be used to invoke the current class constructor.
// It is used to reuse the constructor. In other words, it is used for constructor chaining.

class This {

    This() {

        System.out.println("This_3: It is This_3 Default Constructor.");
    }

    This(int val) {

        // Constructor call must be the first statement in a constructor
        // this as a constructor
        this();
        System.out.println("This_3: In This_3 Class. Parameter val = " + val);
    }
}

public class This_3 {

    public static void main(String[] args) {

        new This(5001);
    }
}

/*
 * Output:
 * 
 * This_3: It is This_3 Default Constructor.
 * This_3: In This_3 Class. Parameter val = 5001
 */