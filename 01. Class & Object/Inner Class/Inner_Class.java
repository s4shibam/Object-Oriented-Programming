// class file: Outer.class
class Outer {

    void show() {

        System.out.println("Outer: I am showing!!!");
    }

    // class file: Outer$Inner.class
    class Inner {

        void print() {

            System.out.println("Inner: I am printing!!!");
        }
    }

    static class InnerStatic {

        void print() {

            System.out.println("InnerStatic: I am printing!!!");
        }
    }
}

// class file: Inner__Class.class
public class Inner_Class {

    public static void main(String[] args) {

        Outer out = new Outer();
        out.show();

        // Inner class can not be accessed like this
        // Inner in = new Inner();

        // Inner Class contains in Outer Class (Outer.Inner)
        // Inner Class object can only be created using object of Outer class
        Outer.Inner in = out.new Inner();
        in.print();

        // static inner class constructor can be directly accessed via outer class name
        Outer.InnerStatic is = new Outer.InnerStatic();
        is.print();
    }
}

/*
 * Output:
 * 
 * Outer: I am showing!!!
 * Inner: I am printing!!!
 * InnerStatic: I am printing!!!
 */