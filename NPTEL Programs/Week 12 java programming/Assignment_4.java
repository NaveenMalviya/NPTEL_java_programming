class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class Assignment_4 extends Parent {
   public static void testClassMethod() { }
public static void main(String[] args) {
        
     // Call the instance method in the Parent class 
    Assignment_4 c= new Assignment_4();
    c.testInstanceMethod();
		
     // Call the static method in the Parent class
    Parent.testClassMethod();
    
    //Parent ob=c;
   //ob.testClassMethod();
  }
}