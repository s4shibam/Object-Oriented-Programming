/*
Method Overloading

Method Overloading: When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by change in the number of arguments or/and a change in the type of arguments.

Function names are same but differentiated by parameter number and types:

	ie.		area (int, int)	
			area (int)	
			area (double, double)	
			area (double)	

*/

class Area_Functions {

	// Area of Rectangle
	public void area(int l, int b) {
		System.out.println("Area of Rectangle is: " + (l * b) + " sq. unit.");
	}

	// Area of Square
	public void area(int s) {
		System.out.println("Area of Square is: " + (s * s) + " sq. unit.");
	}

	// Area of Cone
	public void area(double r, double h) {
		System.out.println("Area of Cone is: " + String.format("%.3f", (3.14 * r * r * h / 3)) + " sq. unit.");
	}

	// Area of Circle
	public void area(double r) {
		System.out.println("Area of Circle is: " + String.format("%.3f", (3.14 * r * r)) + " sq. unit.");
	}
}

public class Method_Overloading {

	public static void main(String[] args) {

		Area_Functions af = new Area_Functions();

		af.area(10, 4);
		af.area(7);
		af.area(2.5, 6.7);
		af.area(7.5);
	}
}

/*
 * Output:
 * 
 * Area of Rectangle is: 40 sq. unit.
 * Area of Square is: 49 sq. unit.
 * Area of Cone is: 43.829 sq. unit.
 * Area of Circle is: 176.625 sq. unit.
 */