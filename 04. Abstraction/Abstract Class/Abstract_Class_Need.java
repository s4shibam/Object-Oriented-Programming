// Redundancy
// To print various types of number, needs multiple methods
class Dull_Printer {

    void print(Integer num) {
        System.out.println(num);
    }

    void print(Double num) {
        System.out.println(num);
    }

    void print(Long num) {
        System.out.println(num);
    }
}

// Number Abstract class can handle all number types
class Smart_Printer {

    // This single method can accept int, double, float, long, short, byte.
    void print(Number num) {
        System.out.println(num);
    }

}

public class Abstract_Class_Need {

    public static void main(String[] args) {

        Dull_Printer dp = new Dull_Printer();

        // Calls void print(Integer num)
        dp.print(123);
        // Calls void print(Double num)
        dp.print(45.354234);
        // Calls void print(Long num)
        dp.print(235623345562l);

        Smart_Printer sp = new Smart_Printer();

        // Calls only void print(Number num)
        sp.print(123);
        sp.print(45.354234);
        sp.print(235623345562l);
    }
}

/*
 * Output:
 * 
 * 123
 * 45.354234
 * 235623345562
 * 123
 * 45.354234
 * 235623345562
 */