package filesPackage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferdInputStreamEg {
public static void main(String[] args) throws IOException {
	FileInputStream fin=new FileInputStream("C:\\Users\\D1\\Desktop\\A.txt");
	BufferedInputStream bin=new BufferedInputStream(fin);
	int i;//here buffer array is created internally.
	while((i=bin.read())!=-1)
	{
		System.out.print((char)i);
	}
	bin.close();
	fin.close();
	
}
}
