package filesPackage;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutPutStreamExam {
public static void main(String[] args) throws IOException{
	FileOutputStream fout=new FileOutputStream("C:\\Users\\D1\\Desktop\\A.txt");
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	String str="this is bufferd output stream";
	byte[] b=str.getBytes();//we have to create buffer array externally
	bout.write(b);
	bout.flush();
	bout.close();
	fout.close();
	System.out.println("success");
}
}
