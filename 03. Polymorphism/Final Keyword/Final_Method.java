/*
Final Method

If you make any method as final, you cannot override it.
*/

class Human {

    final void breathe() {

        System.out.println("Can breathe!");
    }

    void eat() {

        System.out.println("Can eat!");
    }
}

class Man extends Human {

    // Compile-time Error
    // Cannot override final method from Human

    // void breathe() {
    //      System.out.println("Can breathe!");
    // }

    void eat() {

        System.out.println("Can eat Veg or Non-veg!");
    }
}

public class Final_Method {

    public static void main(String[] args) {

        Human man = new Man();
        man.breathe();
        man.eat();
    }
}

/*
 * Output:
 * 
 * Can breathe!
 * Can eat Veg or Non-veg!
 */