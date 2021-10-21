package filesPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//sequence input stream class is used to read the data from multiple streams.
public class SequeInputStrEg {
public static void main(String[] args){
	try {
	FileInputStream fin=new FileInputStream("C:\\Users\\D1\\Desktop\\testin.txt");
	FileInputStream fin1=new FileInputStream("C:\\Users\\D1\\Desktop\\testout.txt");
	SequenceInputStream seq=new SequenceInputStream(fin1,fin);
	int i=0;
	while((i=seq.read())!=-1)
	{
	System.out.print((char)i);	
	}
	seq.close();
	fin.close();
	fin1.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
