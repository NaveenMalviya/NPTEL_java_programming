import java.io.*;
public class test{
	public static void main(String[] args){
		try{
			byte cities[] = {'H', 'I','N', 'A','T', 'A'};
			FileOutputStream fout = new FileOutputStream("file.txt");
			//FileOutputStream fout = new FileOutputStream("H:/complete java/NPTEL Programs/Week 8 java programming/file.txt");
			fout.write(cities);
			fout.close();
			System.out.println("file writing is over...");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}