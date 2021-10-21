package filesPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteByte {
public static void main(String[] args)   {
	FileOutputStream fo;
	try {
		fo = new FileOutputStream("C:\\Users\\D1\\Desktop\\A.txt");
		fo.write(66);//writing byte
		fo.close();
	} 
	
	catch (Exception e) {
		
		e.printStackTrace();
	}
	
	System.out.println("success");
}
}
