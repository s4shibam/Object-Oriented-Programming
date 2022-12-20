// this keyword can be passed through the constructor also.
// It is useful if we have to use one object in multiple classes.

class Alpha {

    Beta b;

    // Alpha accepts Beta class object
    Alpha(Beta b) {

        this.b = b;
    }

    void print() {

        System.out.println("Alpha: " + b.val + " " + b.str);
    }
}

class Beta {

    int val = 1024;
    String str = "GigaBytes";

    Beta() {

        System.out.println("Beta Constructor!");

        // This will lead to stack overflow
        // Beta b = new Beta();
        // Alpha a = new Alpha(b);

        // Even this wouldn't work!
        // Alpha a = new Alpha(new Beta());

        // this acting as a object of current class - Beta
        Alpha a = new Alpha(this);
        a.print();
    }

}

public class This_5 {

    public static void main(String[] args) {

        new Beta();
    }
}

/*
 * Output:
 * 
 * Beta Constructor!
 * Alpha: 1024 GigaBytes
 */