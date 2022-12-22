// super can be used to refer immediate parent class instance variable.

// Super Class
class Alpha {

    int var = 100;
    String name = "Alpha";
}

// Sub Class
class Beta extends Alpha {

    int var = 250;
    String name = "Beta";

    void print() {

        System.out.println(super.var); // Alpha var
        System.out.println(super.name); // Alpha name
        System.out.println("----");
        System.out.println(var); // Beta var
        System.out.println(name); // Beta name
    }

}

class Super_1 {

    public static void main(String[] args) {

        new Beta().print();
    }
}

/*
 * Output:
 * 
 * 100
 * Alpha
 * ----
 * 250
 * Beta
 */