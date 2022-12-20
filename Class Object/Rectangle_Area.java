// Class & Object
// area of Rectangle using object creation

import java.util.*;

class rectangle {

    int ln, br; // Class variable --> Accessible in the whole "rectangle" class

    void sideInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length & Breadth of the Rectangle = ");
        ln = sc.nextInt();
        br = sc.nextInt();
        sc.close();
    }

    void area() {

        sideInput();
        int area = ln * br;
        System.out.println("Rectangle :- length = " + ln + ", Breadth = " + br);
        System.out.println("Area of Rectangle = " + area);

    }
}

public class Rectangle_Area {

    public static void main(String[] args) {

        rectangle rect = new rectangle();
        // rect.sideInput();
        rect.area();
    }
}