class Join_And_IsAlive {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            // Lambda Expression

            int i = 5;
            while (i-- > 0) {

                System.out.println("Actor: I am fighting!");

                try {

                    Thread.sleep(1000);

                } catch (Exception e) {

                    System.out.println("Error!");

                }
            }
        });

        Thread t2 = new Thread(() -> {

            int i = 5;
            while (i-- > 0) {

                System.out.println("Actress: I am dancing!");

                try {

                    Thread.sleep(1000);

                } catch (Exception e) {

                    System.out.println("Error!");

                }
            }
        });

        t1.start();

        try {

            Thread.sleep(10);

        } catch (Exception e) {
        }

        t2.start();

        // Tests if this thread is alive.
        // A thread is alive if it has been started and has not yet died.
        System.out.println("t1 Alive? -> " + t1.isAlive());
        System.out.println("t2 Alive? -> " + t2.isAlive());

        // Waits for this thread to die.
        t1.join();
        t2.join();

        System.out.println("t1 Alive? -> " + t1.isAlive());
        System.out.println("t2 Alive? -> " + t2.isAlive());

        // This code will be executed only after threads are dead
        System.out.println("All Completed!! Main exits...");
    }
}

/*
 * Output: [Total Time Taken: 5 Secs Approx]
 * 
 * Actor: I am fighting!
 * Actress: I am dancing!
 * t1 Alive? -> true
 * t2 Alive? -> true
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * t1 Alive? -> false
 * t2 Alive? -> false
 * All Completed!! Main exits...
 */
