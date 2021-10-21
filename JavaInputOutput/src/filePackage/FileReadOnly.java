package filePackage;

import java.io.File;

public class FileReadOnly {
public static void main(String[] args) throws Exception{
	/*
	 * boolean result;
	 * 
	 * File f1=new File("ABC");
	 * 
	 * f1.createNewFile();
	 * 
	 * result=f1.setReadOnly(); System.out.println("file is read only");
	 */
	
	//we can make the file readonly while keeping the false in setWritable().
	File f2=new File("xyz");
	f2.createNewFile();
	f2.setWritable(false);
	if(f2.canWrite())
	{
		System.out.println("this is writable");
	}
	else
	{
		System.out.println("this is readonly");
	}
}
}
