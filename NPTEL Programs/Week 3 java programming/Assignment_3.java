import java.util.Scanner;

class Shape {
	double length, breadth;

	Shape(double l, double b) { // Constructor to initialize a Shape object
		length = l;
		breadth = b;
	}

	Shape(double len) { // Constructor to initialize another Shape object
		length = breadth = len;
	}

	double calculate() {// To calculate the area of a shape object
		return length * breadth;
	}
}

public class Assignment_3 extends Shape {
	// Template code:
	double height;

	Assignment_3(double length, double h) {
		// base class constructor with one parameter is called
		super(length);
		height = h;
	}

	Assignment_3(double length, double breadth, double h) {
		// base class constructor having two argument is called
		super(length, breadth);
		height = h;
	}

	double calculate() {
		return length * breadth * height;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);// Create an object to read
											// input
		double l = sc.nextDouble(); // Read length
		double b = sc.nextDouble(); // Read breadth
		double h = sc.nextDouble(); // Read height
		Assignment_3 myshape1 = new Assignment_3(l, h);
		Assignment_3 myshape2 = new Assignment_3(l, b, h);
		double volume1;
		double volume2;
		volume1 = myshape1.calculate();
		volume2 = myshape2.calculate();
		System.out.println(volume1);
		System.out.println(volume2);
	}
}