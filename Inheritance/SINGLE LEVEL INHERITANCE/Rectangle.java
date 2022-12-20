import java.util.*;

class Rectangle_Dimension { // Super Class or Parent Class

    int ln, br;

    void dimension() {
        System.out.println("\nSingle Level Inheritance --> Super class");
        System.out.println("----------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the length & breadth of the rectangle = ");
        ln = sc.nextInt();
        br = sc.nextInt();
        sc.close();
    }
}

class Rectangle_Area extends Rectangle_Dimension { // Derived Class or Child Class

    void area() {

        System.out.println("\nSingle Level Inheritance --> Derived class");
        System.out.println("------------------------------------------");

        int area = ln * br;
        System.out.println("\nArea of the rectangle = " + area);
    }

}

public class Rectangle {

    public static void main(String[] args) {

        // Child most Class Object is to be created because this class has all the attributes of the Parent Class
        Rectangle_Area rectangle = new Rectangle_Area();
        rectangle.dimension();
        rectangle.area();
    }
}
