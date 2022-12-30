class Actor extends Thread {

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

class Actress extends Thread {

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

class Multithreading_Using_Thread {

    public static void main(String[] args) {

        Actor actor = new Actor();
        Actress actress = new Actress();

        // Both the methods will run simultaneously depending upon cpu scheduling
        // start() will invoke run()
        actor.start();
        actress.start();

    }
}

/*
 * Output: [Total Time Taken: 5 Secs]
 * 
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 */
