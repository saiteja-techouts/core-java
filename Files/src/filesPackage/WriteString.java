package filesPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteString {
//convert the string into bytes
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("C:\\Users\\D1\\Desktop\\A.txt");
		//String str="techouts";
		byte b[]="techouts".getBytes();
		fout.write(b);
		fout.close();
		System.out.println("success");
	}
}
