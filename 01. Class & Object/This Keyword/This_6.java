// this keyword can be returned as an statement from the method.
// In such case, return type of the method must be the class type (non-primitive).

class Alpha {

    Alpha print() {

        System.out.println("Alpha: Returned 'this'!");
        return this;
    }

    void speak() {

        System.out.println("Hello! This is Alpha speaking!!");
    }
}

public class This_6 {

    public static void main(String[] args) {

        // new Alpha() created an object of Alpha class
        // through that print method has been invoked
        // which returned the object of the current class (this)
        // which is Alpha
        // through that object speak() has been invoked
        new Alpha().print().speak();
    }
}

/*
 * Output:
 * 
 * Alpha: Returned 'this'!
 * Hello! This is Alpha speaking!!
 */