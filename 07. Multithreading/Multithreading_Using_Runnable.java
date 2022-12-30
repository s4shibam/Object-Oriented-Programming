class Actor implements Runnable {

    // Method in a sub class of Thread must be named as run()
    // and should have to be public to achieve Multithreading
    public void run() {

        int i = 5;
        while (i-- > 0) {

            System.out.println("Actor: I am fighting!");

            try {

                Thread.sleep(1000);

            } catch (Exception e) {

                System.out.println("Error!");

            }
        }
    }
}

class Actress implements Runnable {

    // Method in a sub class of Thread must be named as run()
    // and should have to be public to achieve Multithreading
    public void run() {

        int i = 5;
        while (i-- > 0) {

            System.out.println("Actress: I am dancing!");

            try {

                Thread.sleep(1000);

            } catch (Exception e) {

                System.out.println("Error!");

            }
        }
    }
}

class Multithreading_Using_Runnable {

    public static void main(String[] args) {

        // Create Runnable Objects
        Runnable actor = new Actor();
        Runnable actress = new Actress();

        // Set those Runnable objects as parameters to the Thread Class Constructors
        Thread t1 = new Thread(actor);
        Thread t2 = new Thread(actress);

        // Both the methods will run simultaneously depending upon cpu scheduling
        // start() will invoke run() of Thread Class
        t1.start();
        t2.start();

    }
}

/*
 * Output: [Total Time Taken: 5 Secs]
 * 
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 */
