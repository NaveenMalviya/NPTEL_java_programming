public class Assignment_1 extends Thread{
	public void run(){
		System.out.print("Thread is Running.");
	}
public static void main(String args[]){  

		// Creating object of thread class
		Assignment_1 thread=new Assignment_1();  

                // Start the thread
		thread.start();
	}  
}