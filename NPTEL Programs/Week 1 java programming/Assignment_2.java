import java.util.Scanner;  
public class Assignment_2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
        int x = sc.nextInt(); 
        int y = sc.nextInt();
	int z = sc.nextInt();
	int result = 0;
	if(x >= y && x >= z){
            result=x;
        }else if(y >= z){
            result=y;
        }
        else{
            result=z;
        }
	System.out.println(result);
}
}