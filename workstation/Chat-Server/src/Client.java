import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
			Socket soc = new Socket("10.102.49.202", 8020);
			
			Thread readChat = new Thread(){
				@Override
				public void run() {
					InputStream in;
					try {
						in = soc.getInputStream();
						InputStreamReader bridge = new InputStreamReader(in);
						BufferedReader br = new BufferedReader(bridge);
						String line=null;
							while(true){
										line = br.readLine();
										
										System.out.println(line);
							}
						
					} catch (IOException e1) {
						System.out.println("error");
					}
				}
			};
			
			
			
			Thread writeChat = new Thread(){
				@Override
				public void run() {
					try {
						PrintWriter pr = new PrintWriter(soc.getOutputStream(),true);
						Scanner sc = new Scanner(System.in);
						while(true){
							String msg=sc.nextLine();
							if(!msg.isEmpty())
							{
							//	System.out.println("writing msg");
								pr.println("dheeraj:  "+msg);
							}
						}
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			readChat.start();
			writeChat.start();
	}
}
