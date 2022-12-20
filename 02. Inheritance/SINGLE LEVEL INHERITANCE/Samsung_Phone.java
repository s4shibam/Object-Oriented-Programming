// Single Level Inheritance

/* Idea -

    ? One Parent --> One Child

    * Smartphone is the Parent class which consists basic smartphone properties like: name, network & android (member variable).
    * In the parent class a member method also consists: printout()

    Smartphone{} -----> Samsung_Phone{} [name, network, mfd, printout()]    

    * Samsung_Phone is a derived class, inherited all the details of Smartphone class in it.
    * Value of the Variable's has been assigned via object of the derived class: Samsung_Phone (object: sph)
    * printout method also has been called via child/derived class as it has all the properties of its parent class: Smartphone via Single level Inheritance.
 


*/

class Smartphone {

    String name, network;
    int android;

    void printout() {
        System.out.println("I am a SmartPhone");
        System.out.println("Brand name = " + name);
        System.out.println("Network Connectivity = " + network);
        System.out.println("Android version = " + android);
    }
}

class Samsung_Phone extends Smartphone {

    public static void main(String[] args) {

        Samsung_Phone sph = new Samsung_Phone();
        sph.name = "Samsung";
        sph.network = "5G";
        sph.android = 12;

        sph.printout();
    }
}
