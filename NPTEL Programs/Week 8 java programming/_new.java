import java.io.*;
/*public class _new{
	public static void main(String[] args){
		try{
			FileInputStream fin = new FileInputStream("file.txt");
			int i = 0;
			while((i=fin.read())!=-1){
				
				System.out.println((char)i);
			}
			fin.close();
		}catch(Exception e){
		}
	}
} */

public class _new{
	public static void getPaths(File f) throws IOException{
		System.out.println("Name : " + f.getName());
		System.out.println("Path : "+ f.getPath());
		System.out.println("Prrent : "+ f.getParent());
	}
	public static void getInfo(File f) throws IOException{
		if(f.exists()){
			System.out.println("File exists");
			System.out.println(f.canRead()? "and is readable" : "");
			System.out.println(f.canWrite()? "and is writable" : "");
			System.out.println("File is last modified:"+ f.lastModified());
			System.out.println("File is " + f.length() + "bytes");
		}
		else{
			System.out.println("File does not exists");
		}
	}
	public static void main(String[] args) throws IOException{
		File fileToCheck;
		if(args.length>0){
			for(int i = 0; i<args.length; i++){
				fileToCheck = new File(args[i]);
				getPaths(fileToCheck);
				getInfo(fileToCheck);
			}
		}else{
		System.out.println("..............................");
		}
	}
	}
	