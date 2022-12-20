package OOPS;

// Calculate the Area of few shapes using Function Overloading concept

/*
Function names are same but differentiated by parameter number and types:
ie.		area (int, int)	
		area (int)	
		area (double, double)	
		area (double)	

*/

import java.io.*;

class Area_Functions {

	// Area of Rectangle
	public void area(int l, int b) {
		System.out.println("Area of Rectangle is: " + (l * b));
	}

	// Area of Square
	public void area(int s) {
		System.out.println("Area of Square is: " + (s * s));
	}

	// Area of Cone
	public void area(double r, double h) {
		System.out.println("Area of Cone is: " + (3.14 * r * r * h / 3));
	}

	// Area of Circle
	public void area(double r) {
		System.out.println("Area of Circle is: " + (3.14 * r * r));
	}
}

public class Area_Of_Shapes_Using_Function_Overloading {

	public static void main(String[] args) throws IOException {

		Area_Functions ob = new Area_Functions(); // Object is created of a function of different class

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l, b, s;
		double r, h;
		System.out.println("Area of:\n  1. Rectangle\n  2. Square\n  3. Cone\n  4. Circle");
		System.out.print("Enter your choice: ");
		int choice = Integer.parseInt(br.readLine());

		while (true) {
			switch (choice) {

				case 1:
					System.out.print("Enter the length of Rectangle: ");
					l = Integer.parseInt(br.readLine());
					System.out.print("Enter the breadth of Rectangle: ");
					b = Integer.parseInt(br.readLine());

					ob.area(l, b); // 2 Integer type parameter passing
					break;

				case 2:
					System.out.print("Enter the side length of  Square: ");
					s = Integer.parseInt(br.readLine());

					ob.area(s); // 1 Integer type parameter passing
					break;

				case 3:
					System.out.print("Enter the radius of Cone: ");
					r = Integer.parseInt(br.readLine());
					System.out.print("Enter the height of Cone:  ");
					h = Integer.parseInt(br.readLine());

					ob.area(r, h); // 2 Double type parameter passing
					break;

				case 4:
					System.out.print("Enter the radius of Circle: ");
					r = Integer.parseInt(br.readLine());

					ob.area(r); // 1 Double type parameter passing
					break;

				default:
					System.out.println("Wrong Input!!");
					break;
			}
		}
	}
}
