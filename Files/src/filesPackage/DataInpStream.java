package filesPackage;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInpStream {
//it is used to read the data which was written by data output stream.
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("C:\\Users\\D1\\Desktop\\A.txt");
		DataInputStream dis=new DataInputStream(fis);
		int i;
		while((i=dis.read())!=-1)
		{
		System.out.print((char)i);	
		}
	}
}
