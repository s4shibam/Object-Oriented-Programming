/*
Aggregation in Java

If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship
*/

class Operation {

    int multiply(int x, int y) {
        return x * y;
    }
}

class Rectangle {

    // Aggregation
    Operation op;

    int volume(int length, int breadth, int height) {

        op = new Operation();
        return op.multiply(length, breadth) * height;
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        int vol = rec.volume(4, 5, 6);

        System.out.println("Rectangle volume: " + vol);

    }
}

/*
 * Output:
 * 
 * Rectangle volume: 120
 */