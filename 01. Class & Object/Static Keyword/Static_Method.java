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

    Family(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void print() {

        System.out.println("Father's Name: " + father);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    static void changeFatherName() {

        father = "Mr. Sharma";
    }
}

public class Static_Method {

    public static void main(String[] args) {

        Family f1 = new Family("Sakti Mohan", 37);
        Family f2 = new Family("Mukti Mohan", 35);
        Family f3 = new Family("Neeti Mohan", 43);

        // Static variable can be accessed through class name
        Family.father = "Brijmohan";

        f1.print();
        f2.print();
        f3.print();

        // Calling static method
        // ClassName.methodName()
        Family.changeFatherName();

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