// Cannot define a method in an Interface
// Declared methods must be defined while implementing the interface in a Sub Class 
interface Writing {

    // By default, Public and Abstract
    void write();
}

// Inherit Class - extends
// Inherit Interface - implements
class Pen implements Writing {

    // Method definition
    // Must be Public
    public void write() {

        System.out.println("Let's write with Pen!");

    }
}

class Pencil implements Writing {

    // Method definition
    // Must be Public
    public void write() {

        System.out.println("Let's write with Pencil!");

    }
}

class Kit {

    // Will accept both class object - Pen and Pencil
    void action(Writing wt) {

        wt.write();
    }
}

public class Interface_Introduction {

    public static void main(String[] args) {

        Kit kit = new Kit();
        
        Pen p = new Pen();
        Pencil pc = new Pencil();

        // Calls Pen Class method
        kit.action(p);

        // Calls Pencil Class method
        kit.action(pc);
    }
}

/*
 * Output:
 * 
 * Let's write with Pen!
 * Let's write with Pencil!
 */