/*
Static block is used to initialize the static data member.
It is executed before the main method at the time of class loading.
*/

public class Static_Block {

    int val = 512;
    static int stVal = 1024;

    // Will execute when class is being loaded - once
    static {

        // val++; // Error
        stVal++; // 1025
        System.err.println("Static block invoked!");
    }

    // Will execute when object is being created - n times
    Static_Block() {

        ++val; // 513

        System.out.println("Constructor invoked!");
    }

    public static void main(String[] args) {

        System.out.println("Let's Learn Static Block!");

        // Constructor will be called not the static block
        new Static_Block();
        new Static_Block();

        // Can not use non-static variable in static block/ method
        // val++; // error

        // static variable can be used in static method
        stVal++; // 1026
        System.out.println(stVal);

    }

    // This block will execute after first static block,
    // then main method will execute
    static {

        System.err.println("Another Static block!");
    }

}

/*
 * Output:
 * 
 * Static block invoked!
 * Another Static block!
 * Let's Learn Static Block!
 * Constructor invoked!
 * Constructor invoked!
 * 1026
 */