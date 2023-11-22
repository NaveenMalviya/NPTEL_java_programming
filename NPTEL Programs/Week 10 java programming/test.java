import java.io.*;
import java.net.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.*;
/*public class test{
	public static void main(String[] args){
		try{
			URL url = new URL("https://nptel.ac.in/course.php");
			
			System.out.println("protocol: " + url.getProtocol());
			System.out.println("Host: " + url.getHost());
			System.out.println("File: " + url.getFile());
			System.out.println("Port: " + url.getPort());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
*/




/*public class test{
	public static void main(String[] args){
		try{
			URL url = new URL("https://nptel.ac.in/course.php");
			
			URLConnection urlCon = url.openConnection();
			InputStream stream = urlCon.getInputStream();
			
			int i;
			while((i= stream.read())!=-1){
				System.out.print((char)i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
*/


/*public class test{
	public static void main(String[] args){
		try{
			URL url = new URL("https://nptel.ac.in/course.php");
			
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			
			for(int i = 0; i<=0; i++){
				System.out.println(huc.getHeaderFieldKey(i)+ " = " +huc.getHeaderField(i));
			}
			huc.disconnect();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}*/

/*public class test{
	public static void main(String[] args){
		try{
			InetAddress ip = InetAddress.getByName("www.nptel.ac.in");
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
*/


/*public class test{
	public static void main(String[] args) throws Exception{
			DatagramSocket ds = new DatagramSocket();
			String str = "I am Hinata Lover";
			InetAddress ip = InetAddress.getByName("127.0.0.1");
			
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip ,3000);
			ds.send(dp);
			ds.close();
	}
}

class Receiver{
	public static void main(String[] args) throws Exception{
			DatagramSocket ds = new DatagramSocket(3000);
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, 1024);
			ds.receive(dp);
			String str = new String(dp.getData(), 0 , dp.getLength());
			System.out.println(str);
			ds.close();
	}
}
*/


/*
public class test{
	public static void main(String[] args) throws IOException{
			DatagramSocket ds = new DatagramSocket(1234);
			byte[] receive = new byte[65535];
			DatagramPacket dpReceive = null;
			while(true){			
				dpReceive = new DatagramPacket(receive, receive.length);
				ds.receive(dpReceive);
				String receivedData = new String(dpReceive.getData(), 0 , dpReceive.getLength());
				System.out.println("client "+ receivedData);
				
				if(receivedData.equals("bye")){
					System.out.println("client send bye.......Exiting");
					break;
				}
				receive = new byte[65535];
			}
	}
}

class Receiver{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
			DatagramSocket ds = new DatagramSocket();
			
			InetAddress ip = InetAddress.getLocalHost();
			byte[] buf = null;
			while(true){
				String inp = sc.nextLine();
				
				buf = inp.getBytes();
				
				DatagramPacket dpSend = new DatagramPacket(buf, buf.length,ip, 1234);
				
				ds.send(dpSend);
				
				if(inp.equals("bye")){
					break;
				}
			}
	}
}
*/
/*
public class test{
	public static void main(String[] args){
		try{
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String)dis.readUTF();
			System.out.println("message  "+ str);
			ss.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}


class Receiver{
	public static void main(String[] args){
		try{
			Socket s = new Socket("localhost", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hinata lover");
			dout.flush();
			dout.close();
			s.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
*/



/*
public class test{
	public static void main(String[] args) throws IOException{
			ServerSocket ss = new ServerSocket(3333);
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "", str2 = "";
			
			while(!str.equals("stop")){
				str = din.readUTF();
				System.out.println("client says  "+ str);
				str2= br.readLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			din.close();
			s.close();
			ss.close();		
	}
}


class Receiver{
	public static void main(String[] args) throws IOException{
			Socket s = new Socket("localhost", 3333);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "", str2 = "";
			
			while(!str.equals("stop")){
				str = br.readLine();
				dout.writeUTF(str);
				dout.flush();
				str2 = din.readUTF();
				System.out.println("server says  "+ str2);
			}
			din.close();
			s.close();
	}
		
}*/

