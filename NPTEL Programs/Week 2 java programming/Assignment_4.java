// This is the main class Assignment_4
public class Assignment_4{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
		// Answer a1 = new Answer();
	}
}
// This is the class Answer
class Answer{
	// This is the default constructor of the class Answer
	Answer(){
		System.out.println("You got nothing.");
	}
	// This is a parameterized constructor of the class Answer
	Answer(int marks, String type){
		//The 'this()' referene variable is able to call the default constructor of the class.
		this();		
		//Print marks and type of the Assignment_4
		System.out.println("You got "+marks+" for an "+ type);
	}
}