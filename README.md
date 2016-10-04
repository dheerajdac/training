# trainingbnshhshjs
create table department(id int primary key,name varchar(20),role int,department int,foreign key(role) REFERENCES roles(id),foreign key(project) REFERENCES project(id));
create table Employee(employeeid varchar(20),name varchar(20),kinid int,emailid varchar(20),phoneno varchar(10),address varchar(40),dob varchar(10),doj varchar(10),department int,projects int , roles int, foreign key(role) REFERENCES roles(id),foreign key(department) REFERENCES department(id),foreign key(project) REFERENCES project(id));


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
