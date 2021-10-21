package filesPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExa {
//it is a abstract class used to write character streams
	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("C:\\Users\\D1\\Desktop\\A.txt");  
        String con = "hello, Teja";  
        w.write(con);  
        w.close();  
        System.out.println("Done");  
	}
}
