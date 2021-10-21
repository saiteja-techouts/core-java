package filesPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class WriteDataFromtwoFilesIntoAnother {
public static void main(String[] args) throws Exception {
	//reading the data from two files
	FileInputStream fin=new FileInputStream("C:\\Users\\D1\\Desktop\\testin.txt");
	FileInputStream fin1=new FileInputStream("C:\\Users\\D1\\Desktop\\testout.txt");
	//writing the data to another file from the above read files.
	FileOutputStream fout=new FileOutputStream("C:\\Users\\D1\\Desktop\\A.txt");
	SequenceInputStream sis=new SequenceInputStream(fin,fin1);
	
	int i=0;
	while((i=sis.read())!=-1)
	{
		fout.write(i);
		
	}
	System.out.println("success");
	fout.close();
	fin1.close();
	fin.close();
	
	//if we don't close the file we will run out of the file descriptors.
	//file descriptor is a number that identifies the opening file in OS.
}
}
