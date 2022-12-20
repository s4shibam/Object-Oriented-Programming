class Delta {

    void print() {

        System.out.println(this);
    }
}

public class This_Reference {

    public static void main(String[] args) {

        Delta d = new Delta();

        // Both prints the same reference ID
        System.out.println(d);
        d.print();
    }
}

/*
 * Output:
 * 
 * Delta@36baf30c
 * Delta@36baf30c
 */