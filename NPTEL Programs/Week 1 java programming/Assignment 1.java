import java.util.Scanner;  
public class Assignment_1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
        double radius= sc.nextDouble();
        double perimeter;
        double area;
	
	if(radius<=0){
 		System.out.println("please enter non zero positive number ");
	}else{
		perimeter = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;
		System.out.println(perimeter);
		System.out.println(area);
	}
	}
}