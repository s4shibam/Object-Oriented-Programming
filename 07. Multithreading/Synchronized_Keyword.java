/*
Synchronization in Java

Synchronization in Java is the capability to control the access of multiple threads to any shared resource.

Java Synchronization is better option where we want to allow only one thread to access the shared resource.
*/

class Normal_Counter {

    int count = 0;

    // Thread Unsafe
    void increment() {

        count++;
    }
}

class Advance_Counter {

    int count = 0;

    // Thread Safe
    synchronized void increment() {

        count++;
    }
}

public class Synchronized_Keyword {

    public static void main(String[] args) throws Exception {

        // Thread Unsafe Counter
        Normal_Counter nc = new Normal_Counter();

        Thread t1 = new Thread(
                () -> {

                    for (int i = 0; i < 1000; i++)
                        nc.increment();
                });

        Thread t2 = new Thread(
                () -> {

                    for (int i = 0; i < 1000; i++)
                        nc.increment();
                });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // increment() has been called for 2000 times in total,
        // But the result may not be 2000 every time
        // Cause multiple threads can access the increment()
        // at a particular time

        // Thus the threads are accessing the count value in an unsynchronize manner,
        // this may leads to data loss
        // And these may result wrongly incremented count value
        System.out.println("Normal_Counter count: " + nc.count);

        // Thread Safe Counter
        Advance_Counter ac = new Advance_Counter();

        Thread t3 = new Thread(
                () -> {

                    for (int i = 0; i < 1000; i++)
                        ac.increment();
                });

        Thread t4 = new Thread(
                () -> {

                    for (int i = 0; i < 1000; i++)
                        ac.increment();
                });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        // This will always return 2000 cause not more that a single thread can access
        // the increment() at a particular time
        System.out.println("Advance_Counter count: " + ac.count);
    }
}

/*
 * Output:
 * 
 * Normal_Counter count: 1568
 * Advance_Counter count: 2000
 */