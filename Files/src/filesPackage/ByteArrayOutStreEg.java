package filesPackage;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutStreEg {
//byte array output stream is used to  write the multiple data to different files.
	public static void main(String[] args) throws Exception {
		FileOutputStream fo1=new FileOutputStream("C:\\Users\\D1\\Desktop\\testin.txt");
		FileOutputStream fo2=new FileOutputStream("C:\\Users\\D1\\Desktop\\testout.txt");
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		bout.write(71);
		bout.writeTo(fo1);
		bout.writeTo(fo2);
		
		bout.flush();//it is used to write the data from one stream into the another.
		bout.close();
		fo1.close();
		fo2.close();
	}
}
