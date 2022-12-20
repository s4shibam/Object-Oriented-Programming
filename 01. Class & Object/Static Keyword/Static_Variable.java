/*
If you declare any variable as static, it is known as a static variable.

    - The static variable can be used to refer to the common property of all objects (which is not unique for each object).

    - The static variable gets memory only once in the class area at the time of class loading.
*/

class Family {

    // For everyone in the siblings
    // their father's name would be same (Common property)
    static String father;

    String name;
    int age;

    void print() {

        System.out.println("Father's Name: " + father);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Static_Variable {

    public static void main(String[] args) {

        Family f1 = new Family();
        Family f2 = new Family();
        Family f3 = new Family();

        f1.name = "Sakti Mohan";
        f1.age = 37;

        f2.name = "Mukti Mohan";
        f2.age = 35;

        f3.name = "Neeti Mohan";
        f3.age = 43;

        // Static variable can be accessed through class name
        Family.father = "Brijmohan";

        f1.print();
        f2.print();
        f3.print();

        // Change of static variable will be in effect for all objects
        Family.father = "Mr. Sharma";

        f1.print();
        f2.print();
        f3.print();
    }
}

/*
 * Output:
 * 
 * Father's Name: Brijmohan
 * Name: Sakti Mohan
 * Age: 37
 * 
 * Father's Name: Brijmohan
 * Name: Mukti Mohan
 * Age: 35
 * 
 * Father's Name: Brijmohan
 * Name: Neeti Mohan
 * Age: 43
 * 
 * Father's Name: Mr. Sharma
 * Name: Sakti Mohan
 * Age: 37
 * 
 * Father's Name: Mr. Sharma
 * Name: Mukti Mohan
 * Age: 35
 * 
 * Father's Name: Mr. Sharma
 * Name: Neeti Mohan
 * Age: 43
 * 
 */