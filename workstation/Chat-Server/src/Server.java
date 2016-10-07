import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8020);
		System.out.println("waiting");
		
		while(true){
			Socket soc =server.accept();
			System.out.println(soc.getInetAddress().toString());
			if(!soc.getInetAddress().toString().equals("/10.102.49.137") || !soc.getInetAddress().toString().equals("/10.102.49.139" ))
					{
						System.out.println("creating new thread"+soc);
			Thread readChat = new Thread(){
				@Override
				public void run() {
					InputStream in;
					try {
						int limit_msg=0;
						in = soc.getInputStream();
						InputStreamReader bridge = new InputStreamReader(in);
						BufferedReader br = new BufferedReader(bridge);
						String line=null;
							while(true){
										line = br.readLine();
										if(!line.isEmpty()){
										   limit_msg++;
										}
										if(limit_msg>100)
											break;
										buffer.l.add(line);
										buffer.counter++;
								//		System.out.println(line);
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
						int counter=0;
						PrintWriter pr = new PrintWriter(soc.getOutputStream(),true);
					//	Scanner sc = new Scanner(System.in);
						while(true){
							//String msg=sc.nextLine();
						//	if(!msg.isEmpty())
						//	{
						//		System.out.println("writing msg");
							for(int i=counter;i<buffer.counter;i++)
								{
									counter++;
									pr.println(buffer.l.get(i));
								}
							
						//	}
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
	}

}
