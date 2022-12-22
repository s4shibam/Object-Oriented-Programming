// super can be used to invoke immediate parent class method.

// Super Class
class Vegetable {

    void feature() {

        System.out.println("Vegetable: I am Autotroph!");
    }
}

// Sub Class
class Carrot extends Vegetable {

    void feature() {

        System.out.println("Carrot: I am orange in color!");
    }

    void print() {

        feature(); // Call own feature()
        super.feature(); // Calls Vegetable Class feature()
    }
}

class Super_2 {

    public static void main(String[] args) {

        new Carrot().print();
    }
}

/*
 * Output:
 * 
 * Carrot: I am orange in color!
 * Vegetable: I am Autotroph!
 */