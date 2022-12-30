class Multithreading_Using_Lambda {

    public static void main(String[] args) {

        // Directly using Runnable objects as parameters using lambda expression to the
        // Thread Class Constructors

        // Runnable is a Functional Interface,
        // So, no need of Constructor and Method name,
        // It can assume that (Lambda function handles that)

        // Lambda function generated Runnable object used only once(previously)
        // So reduced those line to directly implement
        // the object inside Thread Constructor Parameter

        Thread t1 = new Thread(() -> {

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

        // Both the methods will run simultaneously depending upon cpu scheduling
        // start() will invoke run() of Thread Class
        t1.start();

        // To maintain the order sync between Actor and Actress objects
        try {

            Thread.sleep(10);

        } catch (Exception e) {
        }
        t2.start();

    }
}

/*
 * Output: [Total Time Taken: 5 Secs Approx]
 * 
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actor: I am fighting!
 * Actress: I am dancing!
 */
