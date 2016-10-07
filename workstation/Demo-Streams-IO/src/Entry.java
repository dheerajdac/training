import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Entry {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "test.prmtv";
		/*
		try(FileOutputStream fOut = new FileOutputStream(fileName)){
			IOUtils.writePrimitives(fOut);
		}
		
		try(FileInputStream fIn = new FileInputStream(fileName)){
			IOUtils.readPrimitives(fIn);
		}
		
		FileOutputStream fOut = new FileOutputStream(fileName);
		char c;
	//	while(true){
	//		c= (char)IOUtils.readSystem(System.in);
	//		if(c=='\n')
	//			break;
		//	IOUtils.writeChar(fOut,c);
			
//		}
			
		PrintWriter pr = new PrintWriter(fOut);
		
//		IOUtils.writeString(fOut, IOUtils.readBufferReader(System.in));
		pr.println(IOUtils.readBufferReader(System.in));
		pr.flush();
		pr.close();
		
		File f = new File(fileName);
		if(f.isDirectory()){
			String [] filelist=f.list();
			for(String s:filelist)
				System.out.println(s);
				
		}
		else if(f.isFile()){
			System.out.println(f.getPath()+"	"+f.length()+"		"+f.lastModified());
		}*/
		
	}
}
