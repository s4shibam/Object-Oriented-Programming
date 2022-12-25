/*
Static Method

In static Method in an Interface, implementation of that method can be written in interface itself.

That can be invoked without using the object.
    --> InterFace_Name.methodName()
*/

interface Theta {

    // By default it is final, can not be changed
    int val = 100;

    static void show() {

        // Compile-time Error
        // val = 200;
        System.out.println("Ye! I don't need an object to be invoked!");
    }
}

public class Static_Method {

    public static void main(String[] args) {

        Theta.show();
        System.out.println(Theta.val);
    }
}

/*
 * Output:
 * 
 * Ye! I don't need an object to be invoked!
 * 100
 */