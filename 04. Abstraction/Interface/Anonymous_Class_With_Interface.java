interface Quote {
    void show1();

    void show2();
}

public class Anonymous_Class_With_Interface {

    public static void main(String[] args) {

        // Implemented the interface Quote in an Anonymous class
        // This definition can be used once
        // Or, only using this reference - quote
        Quote quote = new Quote() {
            public void show1() {

                System.out.println("Talk is cheap,");
                System.out.println("Show me the Code!");

            }

            public void show2() {

                System.out.println("Programming is not about typing.");
                System.out.println("It's about thinking!");

            }
        };

        quote.show1();
        System.out.println();
        quote.show2();
    }
}

/*
 * Output:
 * 
 * Talk is cheap,
 * Show me the Code.
 * 
 * Programming is not about typing.
 * It's about thinking!
 */