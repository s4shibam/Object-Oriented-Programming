class Actor {

    void show() {

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

class Actress {

    void show() {

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

class Thread_Sleep {

    public static void main(String[] args) {

        Actor actor = new Actor();
        Actress actress = new Actress();

        // First this function will be executed fully then the rest
        // This will take 5 seconds to be executed
        actor.show();

        // After 5 seconds this method will be executed
        actress.show();

    }
}

/*
 * Output: [Total Time Taken: 10 Secs]
 * 
 * Actor: I am fighting!
 * Actor: I am fighting!
 * Actor: I am fighting!
 * Actor: I am fighting!
 * Actor: I am fighting!
 * Actress: I am dancing!
 * Actress: I am dancing!
 * Actress: I am dancing!
 * Actress: I am dancing!
 * Actress: I am dancing!
 */