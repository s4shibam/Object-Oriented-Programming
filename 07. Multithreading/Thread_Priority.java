/*
Thread Priority

Each thread has a priority. Priorities are represented by a number between 1 and 10. In most cases, the thread scheduler schedules the threads according to their priority (known as preemptive scheduling)
*/

class Thread_Priority {

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

                System.out.println("Actor: I am fighting!\tMy Priority: " + Thread.currentThread().getPriority());

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

                System.out.println("Actress: I am dancing!\tMy Priority: " + Thread.currentThread().getPriority());

                try {

                    Thread.sleep(1000);

                } catch (Exception e) {

                    System.out.println("Error!");

                }
            }
        });

        t1.start();
        t2.start();

        // Set the names of Threads
        t1.setName("Actor-Thread");
        t2.setName("Actress-Thread");

        // Default Name: Thread-0
        System.out.println("t1 Thread Name: " + t1.getName());

        // Default Name: Thread-1
        System.out.println("t2 Thread Name: " + t2.getName());

        System.out.println();

        // Default Priority: 5 [For all Threads]
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println(t1.getName() + " Thread Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Thread Priority: " + t2.getPriority());

    }
}

/*
 * Output: [Total Time Taken: 5 Secs Approx]
 * 
 * t1 Thread Name: Actor-Thread
 * t2 Thread Name: Actress-Thread
 * Actor: I am fighting!    My Priority: 5
 * Actress: I am dancing!   My Priority: 5
 * Actor-Thread Thread Priority: 1
 * Actress-Thread Thread Priority: 10
 * Actress: I am dancing!   My Priority: 10
 * Actor: I am fighting!    My Priority: 1
 * Actor: I am fighting!    My Priority: 1
 * Actress: I am dancing!   My Priority: 10
 * Actor: I am fighting!    My Priority: 1
 * Actress: I am dancing!   My Priority: 10
 * Actress: I am dancing!   My Priority: 10
 * Actor: I am fighting!    My Priority: 1
 */
