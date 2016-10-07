import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class IOUtils {

	public static void writePrimitives(OutputStream out) throws IOException{
//		TODO WRITE A LONG, A DOUBLE, A BOOLEAN VALUE
		
		try(DataOutputStream dOut =  new DataOutputStream(out)){
			dOut.writeLong(1L);
			dOut.writeDouble(12.34);
			dOut.writeBoolean(false);
		}
	}
	
	
	static public void readPrimitives(InputStream in) throws IOException{
		
		try(DataInputStream dIn =  new DataInputStream(in)){
			long lValue = dIn.readLong();
			System.out.print(lValue+"\t");
			
			double dValue = dIn.readDouble();
			System.out.print(dValue+"\t");
			
			boolean flag = dIn.readBoolean();
			System.out.println(flag);
		}
	}
	
	public static void writeChar(OutputStream out,int v) throws IOException{
//		TODO WRITE A LONG, A DOUBLE, A BOOLEAN VALUE
		try(DataOutputStream dOut =  new DataOutputStream(out)){
			dOut.writeChar(v);
		}
		
	}
	
	public static void writeString(OutputStream out,String input) throws IOException{
		try(DataOutputStream dOut =  new DataOutputStream(out)){
			//dOut.writeChars(input);
			dOut.writeUTF(input);
		}
	}
	
	static public int readSystem(InputStream in) throws IOException{
		InputStreamReader isr =new InputStreamReader(System.in);
		return isr.read();
		
	}
	
	static public String readBufferReader(InputStream in) throws IOException{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
		
	}
	
	
	
}
