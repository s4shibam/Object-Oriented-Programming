/*
Class:

A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

A class in Java can contain:

    - Fields
    - Methods
    - Constructors
    - Blocks
    - Nested class and interface.

--------------------------------------------

Object: 

An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

Object Definitions:

    - An object is a real-world entity.
    - An object is a runtime entity.
    - The object is an entity which has state and behavior.
    - The object is an instance of a class.
*/

class MyClass {

    // Instance variable
    int x = 100;
    String s;

    void print() {

        System.out.println("This is print() in MyClass Class.");
    }
}

public class Introduction_To_Class_And_Object {

    public static void main(String[] args) {

        // 'mc' is the object o MyClass Class
        // The new keyword is used to allocate memory at runtime.
        // All objects get memory in Heap memory area.
        MyClass mc = new MyClass();

        // Accessing member (x) through reference variable
        System.out.println("int x: " + mc.x);

        // print() is being called through 'mc' object
        mc.print();

        mc.s = "Shibam Saha";
        System.out.println("String s: " + mc.s);

        mc.x = 200;
        System.out.println("int x: " + mc.x);
    }

}

/*
 * Output:
 * 
 * int x: 100
 * This is print() in MyClass Class.
 * String s: Shibam Saha
 * int x: 200
 * 
 */