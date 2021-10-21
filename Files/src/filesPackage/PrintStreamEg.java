package filesPackage;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEg {
/*printStream class is used to write the data from one stream to another, print stream class automatically 
  flushes the data, there is no need to call flush.*/
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\D1\\Desktop\\A.txt");
		PrintStream ps=new PrintStream(fos);
		ps.println("sai");
		ps.println("teja");
		ps.close();
		fos.close();
		System.out.println("success");
	}
}