// The this keyword can also be passed as an argument in the method.
// It is mainly used in the event handling.

class This {

    void call() {

        // this as a parameter
        method(this);
    }

    void method(This t) {
        System.out.println("This_4: Method invoked!");
        t.print();
    }

    void print() {

        System.out.println("This_4: Hello Dude!!");
    }
}

public class This_4 {

    public static void main(String[] args) {

        This t = new This();
        t.call();
    }
}

/*
 * Output:
 * 
 * This_4: Method invoked!
 * This_4: Hello Dude!!
 */