// Hierarchical Inheritance
/* Idea -

    ? One Parent --> Multiple Child

            Smartphone
        ________|________
        |               |
    Samsung           Oneplus


    * Smartphone is the Parent class which consists basic smartphone properties like: name, origin & price (member variable).
    * In the parent class a member method also consists: printOut().

    Smartphone{} -----> Samsung{} [name, origin, price printOut()]   
    Smartphone{} -----> Oneplus{} [name, origin, price printOut()]   

    * Samsung is a derived class, inherited all the details of Smartphone class in it.
    * Value of the Variable's has been assigned via object of the derived class: Samsung (object: ss)

    * Oneplus is a derived class, inherited all the details of Smartphone class in it.
    * Value of the Variable's has been assigned via object of the derived class: Oneplus (object: op)


    * printOut() method also has been called via both child/derived class as it has all the properties of its parent class: Smartphone via hierarchical Inheritance.

*/

// Parent class or Base Class
class Smartphone {

    String name, origin;
    int price;

    void printOut() {

        System.out.println("Hi! I am a Smartphone!");
        System.out.println("Basic Details:\n   Screen type: Amoled\n   Screen Size: 6.5 Inch");

        System.out.println("Brand Specific Features: ");
        System.out.println("   Brand name = " + name);
        System.out.println("   Brand Origin = " + origin);
        System.out.println("   Phone Price = " + price);
    }
}

// Derived Class or Child Class
class Samsung extends Smartphone {
    
    public void samsungPhone() {
        
        Samsung ss = new Samsung();
        ss.name = "Samsung";
        ss.origin = "South Korea";
        ss.price = 20000;
        
        ss.printOut();
    }
    
}

// Derived Class or Child Class
class Oneplus extends Smartphone {

    public void oneplusPhone() {


        /* 
        Below member variables and method can also be called without the help of object creation.
        Because, all the details are inherited from Smartphone and those variables and method are its own now.
        
            name = "Oneplus";
            origin = "China";
            price = 41000;

            printOut();
        */
        
        Oneplus op = new Oneplus();
        op.name = "Oneplus";
        op.origin = "China";
        op.price = 41000;

        op.printOut();
    }
}

public class Phone_Details {
    public static void main(String[] args) {

        Samsung ssp = new Samsung();
        ssp.samsungPhone();

        System.out.println();

        Oneplus opp = new Oneplus();
        opp.oneplusPhone();
    }

}
