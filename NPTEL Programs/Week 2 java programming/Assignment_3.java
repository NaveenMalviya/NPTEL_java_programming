// This is the main class Assignment_3
public class Assignment_3 {
	public static void main(String[] args) {
		// Object of the main class is created
		Assignment_3 q = new Assignment_3();
		// Print method on object of Assignment_3 class is called
		q.studentMethod();
	}

	// 'print()' method is defined in class Assignment_3
	void print(Assignment_3 object) {
		System.out.print("Well Done!");
	}
	// Define a method named 'studentMethod()' in class Assignment_3

	// Call the method named 'print()' in class Assignment_3
	void studentMethod() {
		// Call the method named 'print()' in class Assignment_3
		print(this);
	}
}