// Class & Object
// Area of Rectangle, Circle and Cone using object creation for different classes

import java.io.*;

class rectangle {

    int ln, brd; // Class variable --> Accessible in the whole "rectangle" class

    void dimensionInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Length of the Rectangle = ");
        ln = Integer.parseInt(br.readLine());
        System.out.print("Enter Breadth of the Rectangle = ");
        brd = Integer.parseInt(br.readLine());
    }

    void area() throws IOException {

        dimensionInput();
        int area = ln * brd;
        System.out.println("Rectangle :- length = " + ln + ", Breadth = " + brd);
        System.out.println("Area of Rectangle = " + area);
    }
}

class circle {

    int rad;

    void dimensionInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Radius of Circle = ");
        rad = Integer.parseInt(br.readLine());
    }

    void area() throws IOException {

        dimensionInput();
        double area = (double) (3.14 * rad * rad);
        System.out.println("Radius of Circle = " + rad);
        System.out.printf("Area of Circle = %.2f\n", area);
    }
}

class cone {

    int rad, hgt;

    void dimensionInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Radius of Cone = ");
        rad = Integer.parseInt(br.readLine());
        System.out.print("Enter the Height of Cone = ");
        hgt = Integer.parseInt(br.readLine());
    }

    void area() throws IOException {

        dimensionInput();
        double area = (double) (3.14 * rad * rad * hgt);
        System.out.println("Radius of Circle = " + rad);
        System.out.printf("Area of Circle = %.2f\n", area);
    }
}

public class Area_Of_Shapes {

    public static void main(String[] args) throws IOException {

        rectangle rectangle = new rectangle();
        rectangle.area();

        circle circle = new circle();
        circle.area();

        cone cone = new cone();
        cone.area();
    }
}

/*
 * Output:
 * Enter Length of the Rectangle = 5
 * Enter Breadth of the Rectangle = 6
 * Rectangle :- length = 5, Breadth = 6
 * Area of Rectangle = 30
 * Enter the Radius of Circle = 4
 * Radius of Circle = 4
 * Area of Circle = 50.24
 * Enter the Radius of Cone = 7
 * Enter the Height of Cone = 3
 * Radius of Circle = 7
 * Area of Circle = 461.58
 */