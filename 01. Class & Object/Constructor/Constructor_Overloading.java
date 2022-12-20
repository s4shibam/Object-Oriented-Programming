/*
Constructor Overloading:

In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.
*/

class Value {

    Value() {

        System.out.println("No Value!");
    }

    Value(int val) {

        System.out.println("Integer Value! Value =  " + val);
    }

    Value(Double val) {

        System.out.println("Double Value! Value =  " + val);
    }

    Value(Long val) {

        System.out.println("Long Value! Value = " + val);
    }

}

public class Constructor_Overloading {

    public static void main(String[] args) {

        new Value();
        new Value(1234);
        new Value(20.234);
        new Value(9_123_372_036_854_700_800l);
    }
}

/*
 * Output:
 * 
 * No Value!
 * Integer Value! Value = 1234
 * Double Value! Value = 20.234
 * Long Value! Value = 9123372036854700800
 */