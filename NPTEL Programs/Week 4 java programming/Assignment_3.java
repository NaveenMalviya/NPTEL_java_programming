interface ExtraLarge{
	static String extra = "This is extra-large";
	void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print();  
        System.out.println("This is small");
    }
}
 
class Assignment_3 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
		Assignment_3 q = new Assignment_3();
		q.display();
    }
	public void display(){
		System.out.println(extra);
	}
}