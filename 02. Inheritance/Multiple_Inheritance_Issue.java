/*
Multiple Inheritance Issue With Interface

If there is 2 Interfaces and both having same named method (same signatures) and both has been implemented in a class, then while calling that method, which method will get executed form 2 of the Interfaces?

This is the ambiguity problem of Interfaces.

To solve this issue, there are 2 options:
1. Override the method in the Subclass
2. Explicitly declare which parent method to call
*/

// Parent  
interface Alpha {
    
    default void show1() {
        
        System.out.println("Alpha: This is Alpha!");
    }
    
    default void show2() {
        
        System.out.println("Alpha: This is Alpha V2!");
    }
    
}

// Parent  
interface Beta {

    default void show1() {

        System.out.println("Beta: This is Beta!");
    }

    default void show2() {

        System.out.println("Beta: This is Beta V2!");
    }
}

/*
Generally it will throw an error:
  
Duplicate default methods named show1 with the parameters () and () are inherited from the types Beta and Alpha
*/

// Sub Class
class Implementor implements Alpha, Beta {

    // Overridden
    public void show1() {

        System.out.println("Implementor: Method overrode!");
    }

    // Explicitly declared
    @Override
    public void show2() {

        // Calls Alpha --> show1()
        Alpha.super.show2();

        // Calls Beta --> show1()
        Beta.super.show2();
    }

}

public class Multiple_Inheritance_Issue {

    public static void main(String[] args) {

        Implementor imp = new Implementor();

        imp.show1();
        imp.show2();
    }
}

/*
 * Output:
 * 
 * Implementor: Method overrode!
 * Alpha: This is Alpha V2!
 * Beta: This is Beta V2!
 */