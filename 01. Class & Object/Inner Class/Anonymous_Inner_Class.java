/*
Anonymous Inner Class

It is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain "extras" such as overriding methods of a class or interface, without having to actually subclass a class.
*/

class Alpha {

    void print() {

        System.out.println("Alpha is the best!");
    }
}

public class Anonymous_Inner_Class {

    public static void main(String[] args) {

        // This anonymous class is only valid for "a1" object
        Alpha a1 = new Alpha() {

            // Alpha class print() has been neglected / overridden
            void print() {

                System.out.println("Delta is the best!!!");
            }
        };
        a1.print();
        a1.print();

        Alpha a2 = new Alpha();
        a2.print();
    }
}

/*
 * Output:
 * 
 * Delta is the best!!!
 * Delta is the best!!!
 * Alpha is the best!
 */
